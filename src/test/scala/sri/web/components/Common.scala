package sri.web.components

case class ScalaField(name: String,
                      tpe: String,
                      isRequired: Boolean = false,
                      customTypeDef: String = "") {
  override def hashCode(): Int = name.hashCode

  override def equals(obj: scala.Any): Boolean = obj match {
    case o: ScalaField => o.name == name
    case _             => false
  }
}

case class ScalaType(name: String, customDef: String)

case class ComponentInfo(name: String,
                         import1: String,
                         import2: String,
                         props: Set[ScalaField],
                         hasChildren: Boolean = true,
                         staticFields: Set[ScalaField] = Set())

trait Common {

  def removeComments(in: String) =
    if (in != null)
      in.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)", "")
    else in

  def getScalaName(in: String): String = in match {
    case "type"   => "`type`"
    case "var"    => "`var`"
    case "object" => "`object`"
    case "then"   => "`then`"
    case _        => in
  }

  def getComponentFile(ci: ComponentInfo, prefix: String = "") = {

    val atleastOneRequiredField = ci.props.exists(_.isRequired)
    val name = addPrefix(ci.name, prefix)
    s"""
         |
       | @js.native
         | @JSImport("${ci.import1}",${if (ci.import2 == "JSImport.Default" || ci.import2 == "JSImport.Namespace")
         ci.import2
       else "\"" + ci.import2 + "\""})
         |object ${name}Component extends JSComponent[js.Object] {
         |
       | }
         |
       | object ${name} {
         |
       |    @inline
         |    def apply(${ci.props
         .map(sf =>
           s"${getScalaName(sf.name)} : ${if (sf.isRequired) s"${sf.tpe}"
           else s"OptionalParam[${sf.tpe}] = OptDefault"}")
         .mkString(",\n")},
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
         |@exclude key: String | Int = null,
         |      @exclude ref: js.Function1[${name}Component.type, Unit] = null)${if (ci.hasChildren)
         s"(children: ReactNode*)"
       else ""}: ReactElement { type Instance = ${name}Component.type}  = {
         |      import DangerousUnionToJSAnyImplicit._
         |      val props = FunctionObjectMacro()
         |      extraProps.foreach(v => { MergeJSObjects(props, v) })
         |    CreateElementJS[${name}Component.type](
         |      ${name}Component,
         |      props,
         |      key,
         |      ref${if (ci.hasChildren) s",children.toJSArray" else ""})
         |    }
         | }
         |
       | ${if (!atleastOneRequiredField && ci.hasChildren)
         s"""
           |
            | object ${addPrefix(ci.name, prefix)}C {
           |
         |   @inline
           |   def apply(children:ReactNode*) = {
           |     CreateElementJS[${name}Component.type](
           |      ${name}Component,
           |      json(),
           |      children = children.toJSArray)
           |   }
           |
            | }
           |
          """.stripMargin
       else ""}

         ${ci.props
         .filter(_.customTypeDef.nonEmpty)
         .map(_.customTypeDef)
         .mkString("\n")}

         |
     """.stripMargin
  }

  val defaultImports =
    s"""
         |import sri.core._
         |import scalajsplus.macros.{
         |  FunctionObjectMacro,
         |  exclude,
         |  rename
         |}
         |import scalajsplus._
         |import sri.universal._
         |import scala.scalajs.js.annotation.JSImport
         |import scala.scalajs.js.annotation.JSName
         |import sri.web.vdom.DOMProps
         |import org.scalajs.dom
         |import sri.web.vdom.ReactEventAliases._
         |import scala.scalajs.js
         |import scala.scalajs.js.Dynamic.{literal => json}
         |import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
         |import scala.scalajs.js.|
     """.stripMargin

  def addPrefix(name: String, prefix: String) =
    if (prefix.trim.isEmpty || name.startsWith(prefix)) name
    else s"${prefix}${name}"
}
