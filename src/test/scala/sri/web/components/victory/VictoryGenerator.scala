package sri.web.components.victory

import sri.web.components.Typescript._
import sri.web.components._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object VictoryGenerator extends Common {
  val OUTPUT_PATH =
    "src/main/scala/sri/web/components/victory"
  def run() = {

    val input = Fs.readFileSync("victory/victory.d.ts", "utf-8")

    val ast = Typescript
      .createSourceFile("index.d.ts", input)
      .statements
      .head
      .asInstanceOf[ModuleDeclaration]
//      .getChildAt(0)

//    Fs.writeFileSync("victory.json", CircularJSON.stringify(ast))

    println(s"syntax : ${ast.body.get.statements.length}")
    getComponents(ast)

  }

  def getComponents(in: ModuleDeclaration) = {

    val enums = TypeScriptConverter
      .getLiteralEnumsInModule(in)
      .map(
        uta =>
          TypeScriptConverter
            .convertLiteralEnumToScala(uta.`type`.asInstanceOf[UnionTypeNode],
                                       TypeScriptConverter.getNodeName(uta)))
      .mkString("\n")

    val components = in.body.get.statements
      .filter(s => s.kind == SyntaxKind.ClassDeclaration)
      .foreach(s => {
        val name = TypeScriptConverter.getNodeName(s)
        val propsName = TypeScriptConverter.getNodeName(
          s.asInstanceOf[ClassDeclaration]
            .heritageClauses
            .get
            .head
            .types
            .head
            .typeArguments
            .head
            .asInstanceOf[TypeReferenceNode]
            .typeName
            .asInstanceOf[Node])
        val props = in.body.get.statements
          .find(s =>
            s.kind == SyntaxKind.InterfaceDeclaration && TypeScriptConverter
              .getNodeName(s) == propsName)
          .map(i =>
            TypeScriptConverter.getAllPropertiesFromInterface(propsName, in))
          .get

        val ci = ComponentInfo(name = name,
                               import1 = "victory",
                               import2 = name,
                               props = props.toSet,
                               hasChildren =
                                 props.exists(sf => sf.name == "children"))
        println(s"Name: ${name} , PropsName : $propsName")

        val content =
          s"""
             |
             |package sri.web.components.victory;
             |
             |$defaultImports
             |
             |${getComponentFile(ci)}
             |
           """.stripMargin

        Fs.writeFileSync(s"$OUTPUT_PATH/${name}.scala", content)
      })

    val output =
      s"""
         |package sri.web.components.victory;
         |
         |$enums
       """.stripMargin

    Fs.writeFileSync(s"${OUTPUT_PATH}/VictoryEnums.scala", output)
  }
}
@js.native
@JSImport("circular-json", JSImport.Namespace)
object CircularJSON extends js.Object {

  def stringify(in: js.Any): String = js.native
}
