package sri.web.components

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.JSON
import scala.util.Try

object TypeScriptConverter {
  import Typescript._

  val scalaReservedWords = Set("type", "var", "val")

  val tsToScalaMap = Map("string" -> "String",
                         "number" -> "Double",
                         "boolean" -> "Boolean",
                         "void" -> "Unit",
                         "Number" -> "Double")

  def convertTypeScriptToScala(in: String): String = {

    val s = Typescript.createSourceFile("index.ts", in).getChildAt(0)
    dom.window.console
      .log(s)

    dom.window.console.log(
      convertInterfaceToScala(
        s.getChildAt(5).asInstanceOf[InterfaceDeclaration]))
    ""
  }

  def parseFunction(in: Typescript.FunctionDeclaration): String = {

    val name = getNodeName(in)

    ""
  }

  def convertTypeReferenceNodeToScala(input: TypeReferenceNode): String = {
    val name = getNodeName(input.typeName.asInstanceOf[Node])
    val params =
      input.typeArguments
        .map(a => a.map(n => convertTypeNodeToScala(n)).mkString(","))
        .getOrElse("")
    if (params.nonEmpty) s"${name}[$params]" else name
  }

  def convertTypeNodeToScala(input: TypeNode): String = {
    input.kind match {
      case SyntaxKind.StringLiteral  => "String"
      case SyntaxKind.StringKeyword  => "String"
      case SyntaxKind.NumberKeyword  => "Double | Int"
      case SyntaxKind.NumericLiteral => "Double | Int"
      case SyntaxKind.BooleanKeyword => "Boolean"
      case SyntaxKind.VoidKeyword    => "Unit"
      case SyntaxKind.TypeLiteral =>
        convertTypeLiteralToScala(input.asInstanceOf[TypeLiteralNode])
      case SyntaxKind.TypeReference =>
        convertTypeReferenceNodeToScala(input.asInstanceOf[TypeReferenceNode])
      case SyntaxKind.FunctionType =>
        convertFunctionTypeNodeToScala(input.asInstanceOf[FunctionTypeNode])
      case _ => {
        println(s"Unknon type for kind : ${input.kind}")
        "js.Any"
      }
    }
  }

  def convertParameterToScala(input: ParameterDeclaration): String = {
    val name = getNodeName(input)
    val tpe = convertTypeNodeToScala(input.`type`.get)
    val finalType =
      if (input.questionToken.isDefined) s"js.UndefOr[$tpe]"
      else tpe
    s"$name: $finalType"
  }

  def convertPropertySignatureToScala(input: PropertySignature) = {
    val name = getNodeName(input)
    val tpe = convertTypeNodeToScala(input.`type`.get)

    s"val $name:${if (input.questionToken.isDefined) s"js.UndefOr[$tpe]"
    else tpe} = js.native"

  }

  def convertTypeLiteralToScala(input: TypeLiteralNode): String = {

    val members = input.members
      .map(te => {
        val tpe =
          convertTypeNodeToScala(te.asInstanceOf[PropertySignature].`type`.get)
        s"val ${getNodeName(te)}: ${if (te.questionToken.isDefined) s"js.UndefOr[$tpe]"
        else tpe}"
      })
      .mkString("; ")
    s"js.Object  { $members }"
  }

  def convertFunctionTypeNodeToScala(in: FunctionTypeNode): String = {
    "UNKNONW"
  }

  def convertMethodSignatureToScala(input: MethodSignature) = {
    val name = getNodeName(input)
    val returnType = convertTypeNodeToScala(input.`type`.get)
    val params =
      input.parameters.map(pd => convertParameterToScala(pd)).mkString(", ")
    s"def $name($params):$returnType = js.native"
  }

  def convertTypeElementToScala(input: TypeElement) = {}

  def convertInterfaceToScala(input: InterfaceDeclaration) = {

    val name = getNodeName(input)

    val members = input.members
      .map(m =>
        if (m.kind == SyntaxKind.MethodSignature)
          convertMethodSignatureToScala(m.asInstanceOf[MethodSignature])
        else convertPropertySignatureToScala(m.asInstanceOf[PropertySignature]))
      .mkString("\n")
    s"""
       |@js.native
       |trait $name extends js.Object {
       | $members
       |}
     """.stripMargin

  }

  def convertUnionTypeToScala(input: UnionTypeNode): String = { "" }

  def getPropertiesFromInterface(in: InterfaceDeclaration): List[ScalaField] = {

    in.members
      .filter(s => s.kind == SyntaxKind.PropertySignature)
      .map(p => {
        convertPropertySignatureToScalaField(p.asInstanceOf[PropertySignature])
      })
      .toList

  }

  def getAllPropertiesFromInterface(interfaceName: String,
                                    md: ModuleDeclaration): List[ScalaField] = {
    val id = getInterfaceDeclarationFromModule(md, interfaceName).get
    val ext = getExtendedInterfaces(id)
    getPropertiesFromInterface(id) ++ ext.flatMap(n =>
      getAllPropertiesFromInterface(n, md))

  }

  def convertPropertySignatureToScalaField(
      input: PropertySignature): ScalaField = {
    val name = getNodeName(input)
    val tpe = convertTypeNodeToScala(input.`type`.get)
    ScalaField(name = name, tpe = tpe, isRequired = input.questionToken.isEmpty)

  }

  def getExtendedInterfaces(in: InterfaceDeclaration): List[String] = {
    in.heritageClauses
      .map(hs => hs.head.types.map(t => getNodeName(t)).toList)
      .getOrElse(List())
  }

  def getInterfaceDeclarationFromModule(in: ModuleDeclaration, name: String) = {
    in.body.get.statements
      .find(s =>
        s.kind == SyntaxKind.InterfaceDeclaration && name == getNodeName(s))
      .map(s => s.asInstanceOf[InterfaceDeclaration])
  }

  def getLiteralEnumsInModule(in: ModuleDeclaration) = {
    in.body.get.statements
      .filter(s => {
//        println(s" Statement is equal to union : ${JSON
//          .stringify(s.name.getOrElse("ud").asInstanceOf[js.Any])} .. ${s.kind} ${s.kind == SyntaxKind.UnionType}")
        println(s"Statement : ${getNodeName(s)}")
        s.kind == SyntaxKind.TypeAliasDeclaration && s
          .asInstanceOf[TypeAliasDeclaration]
          .`type`
          .kind == SyntaxKind.UnionType && isLiteralUnionType(
          s.asInstanceOf[TypeAliasDeclaration]
            .`type`
            .asInstanceOf[UnionTypeNode])
      })
      .map(_.asInstanceOf[TypeAliasDeclaration])
  }

  def convertLiteralEnumToScala(in: UnionTypeNode, n: String = "") = {
    val name = if (n.nonEmpty) n else getNodeName(in)
    println(s"Converting LiteralEnum : $name , types : ${in.types}")
    val fields = in.types
      .map(t => {

        val utn = t.asInstanceOf[LiteralTypeNode].literal.asInstanceOf[Node]
        println(s"UTN : ${JSON.stringify(utn)}")
        val literalText = utn.asInstanceOf[js.Dynamic].text.toString
        if (utn.kind == SyntaxKind.StringLiteral) {
          s""" @inline def ${literalText.toUpperCase
            .replaceAll("-", "_")} = "$literalText".asInstanceOf[$name] """
        } else if (utn.kind == SyntaxKind.NumericLiteral) {
          s""" @inline def ${if (Try(literalText.toInt).isSuccess)
            s"_$literalText"
          else
            s"_${literalText.replaceAll(".", "_")}"} = ${literalText}.asInstanceOf[$name]  """
        } else {
          s""" @Inline def ${literalText.toUpperCase} = ${literalText}.asInstanceOf[$name] """
        }
      })
      .mkString("\n")
    s"""
       |
       |sealed trait ${name} extends js.Object
       |
       |object $name {
       | 
       | $fields
       |
       |}
       |
     """.stripMargin
  }

  def isLiteralUnionType(in: UnionTypeNode): Boolean = {
    println(s"checking uniontype literal : ${in.types.length})}")
    in.types.forall(n => n.kind == SyntaxKind.LiteralType)
  }

  /**
    *
    * @param node
    * @return
    */
  def getNodeName(node: Typescript.Node): String = {
    val name = if (!js.isUndefined(node.asInstanceOf[js.Dynamic].escapedText)) {
      node.asInstanceOf[Typescript.Identifier].escapedText
    } else if (!js.isUndefined(node.asInstanceOf[js.Dynamic].expression) && !js
                 .isUndefined(node
                   .asInstanceOf[js.Dynamic]
                   .expression
                   .escapedText)) {
      node
        .asInstanceOf[js.Dynamic]
        .expression
        .escapedText
        .toString
    } else {
      node.name
        .map(name => {
          if (!js.isUndefined(name.asInstanceOf[js.Dynamic].escapedText)) {
            name.asInstanceOf[Typescript.Identifier].escapedText
          } else {
            name.toString
          }
        })
        .getOrElse("FIX_MY_NAME")
    }

    if (scalaReservedWords.contains(name)) s"`$name`"
    else name
  }
}
