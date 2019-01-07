package sri.web.components.materialui

import sri.web.components._
import scala.scalajs.js

object MuiGenerator extends MuiCommon with Common {

  case class ComponentNameAndModule(name: String, module: String)
  val MATERIAL_UI_SOURCE_PATH = "material-ui/packages/material-ui/src"

  val SVG_ICONS_PATH = "material-ui/packages/material-ui-icons/src"

  val OUTPUT_PATH =
    "src/main/scala/sri/web/components/materialui"

  val INDEXFILE = s"${MATERIAL_UI_SOURCE_PATH}/index.js"

  def generateComponents() = {
    val globalProps = Set(
      ScalaField("style", "js.Any"),
      ScalaField("id", "String"),
      ScalaField("className", "String"),
      ScalaField("classes", "js.Object"),
      ScalaField("onClick", "ReactEventH => _")
    )

    val in =
      removeComments(Fs.readFileSync(INDEXFILE, "utf-8"))
        .replace("import * as colors from './colors';", "")
        .replace("export { colors };", "")

    val components = in
      .split(";")
      .filter(_.trim.nonEmpty)
      .flatMap(s => {
        val s1 = s.split("from")
        //        println(s"split from : ${s1.toList}")
        val cs = s1.head
          .replace("export", "")
          .replace("{", "")
          .replace("default as", "")
          .replace("}", "")
          .trim
        val module = s1.last.replace("'", "").replace("./", "").trim
        cs.split(",").map(c => ComponentNameAndModule(c.trim, module))
      })

    val excludedComponents =
      Set(
        "ClickAwayListener",
        "LabelSwitch",
        "ModalManager",
        "withMobileDialog",
        "createMuiTheme",
        "withStyles",
        "createGenerateClassName",
        "jssPreset",
        "withWidth",
        "withTheme"
      )

    components
      .filterNot(ci => excludedComponents.contains(ci.name))
      .foreach(ci => {
        val filePath = s"${MATERIAL_UI_SOURCE_PATH}/${ci.module}/${ci.name}.js"

        val defaultProps: Set[ScalaField] = globalProps ++ jsPropTypesOverrides
          .getOrElse(ci.name, Set())

        println(s"getting component path : $filePath")
        val ast =
          ReactDocGenJS.parse(
            Fs.readFileSync(filePath, "utf-8").toString,
            ReactDocGenJS.resolver.findAllComponentDefinitions)

        val jsProps: js.Array[ScalaField] = js.Array()
        var voidElement = true
        ast.headOption.get.props
          .filterNot {
            case (name, prop) => prop.description.contains("@ignore")
          }
          .foreach {
            case (name, prop) => {

              if (name == "children") { voidElement = false } else if ((prop.`type`.isDefined || prop.flowType.isDefined) && !defaultProps.toList
                                                                         .exists(
                                                                           _.name == name)) {
                if (name != "key") {
                  jsProps.push(
                    ReactDocGen.getScalaFieldFromReactOrFlowProp(componentName =
                                                                   ci.name,
                                                                 name = name,
                                                                 prop = prop))
                }
              }
            }
          }
        val componentInfo = ComponentInfo(
          name = ci.name,
          import1 = s"@material-ui/core/${ci.module}",
          import2 = if (ci.module == ci.name) "JSImport.Default" else ci.name,
          hasChildren = !voidElement,
          props = defaultProps ++ jsProps.toSet
        )

        val content =
          s"""
             |package sri.web.components.materialui;
             |
           |${defaultImports}
             |
           |
           |${getComponentFile(componentInfo, "Mui")}
             |
         """.stripMargin
        Fs.writeFileSync(
          s"${OUTPUT_PATH}/${addPrefix(ci.name, MUI_PREFIX)}.scala",
          content)

      })

  }

  def generateSVGIcons() = {
    val svgin =
      removeComments(Fs.readFileSync(s"${SVG_ICONS_PATH}/index.js", "utf-8"))

    val svgIcons = svgin
      .split(";")
      .filter(_.trim.nonEmpty)
      .foreach(s => {
        val s1 = s.split("from")
        val name = s1.head
          .replace("export {", "")
          .replace("default as", "")
          .replace("}", "")
          .trim
        val module = s1.last.replace("'", "").replace("./", "").trim
        val content = s"""
                         |
          |package sri.web.components.materialui.svgicons
                         |
          |$defaultImports
                         |
          |@js.native
                         |@JSImport("@material-ui/icons/${module}",JSImport.Default)
                         |object ${addPrefix(name, MUI_PREFIX)}IconComponent extends JSComponent[js.Object]
                         |
          |object ${addPrefix(name, MUI_PREFIX)}Icon {
                         |
          | @inline
                         | def apply(style : OptionalParam[js.Any] = OptDefault,
                         |   className : OptionalParam[String] = OptDefault,
                         |   id : OptionalParam[String] = OptDefault,
                         |      @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
                         |@exclude key: String | Int = null ): ReactElement { type Instance = ${addPrefix(
                           name,
                           MUI_PREFIX)}IconComponent.type}  = {
                         |      import DangerousUnionToJSAnyImplicit._
                         |      val props = FunctionObjectMacro()
                         |      extraProps.foreach(v => { MergeJSObjects(props, v) })
                         |    CreateElementJS[${addPrefix(name, MUI_PREFIX)}IconComponent.type](
                         |      ${addPrefix(name, MUI_PREFIX)}IconComponent,
                         |      props,
                         |      key)
                         |    }
                         |
          |}
                         |
        """.stripMargin

        Fs.writeFileSync(
          s"${OUTPUT_PATH}/svgicons/${addPrefix(name, MUI_PREFIX)}Icon.scala",
          content)
      })
  }

  def generateMuiColors() = {
    val in = removeComments(
      Fs.readFileSync(s"${MATERIAL_UI_SOURCE_PATH}/styles/colors.js", "utf-8"))
    val colors = in
      .split(";")
      .filter(_.trim.nonEmpty)
      .map(s => {
        val s1 = s.split("=")
        val name = s1.head.replace("export const", "").trim
        val v1 = s1.last.trim
        if (v1.contains("{")) {
          s"val $name: ColorPalette  = js.native"
        } else
          s"""
             |val $name: String = js.native
         """.stripMargin

      })

    val content = s"""
                     |package sri.web.components.materialui
                     |
       |$defaultImports
                     |
       |
       |@js.native
                     |trait ColorPalette extends js.Object {
                     |
       | @JSName("50")
                     | val _50 : String = js.native
                     |
       | @JSName("100")
                     | val _100 : String = js.native
                     |
       | @JSName("200")
                     | val _200 : String = js.native
                     |
       | @JSName("300")
                     | val _300 : String = js.native
                     |
       | @JSName("400")
                     | val _400 : String = js.native
                     |
       | @JSName("500")
                     | val _500 : String = js.native
                     |
       | @JSName("600")
                     | val _600 : String = js.native
                     |
       | @JSName("700")
                     | val _700 : String = js.native
                     |
       | @JSName("800")
                     | val _800 : String = js.native
                     |
       | @JSName("900")
                     | val _900 : String = js.native
                     |
       |val A100: String = js.native
                     |
       |
       |val A200: String = js.native
                     |
       |
       |val A400: String = js.native
                     |
       |
       |val A700: String = js.native
                     |
       |
       |val contrastDefaultColor: String = js.native
                     |
       |}
                     |
       |@js.native
                     |@JSImport("@material-ui/core/styles/colors.js",JSImport.Namespace)
                     |object ${MUI_PREFIX}Colors extends js.Object {
                     |
       | ${colors.mkString("\n")}
                     |}
                     |
       |
       |
       |
     """.stripMargin

    Fs.writeFileSync(s"${OUTPUT_PATH}/${MUI_PREFIX}Colors.scala", content)
  }

  def generateThemes() = {

    val content =
      s"""
         |package sri.web.components.materialui
         |
         |$defaultImports
         |
         |@js.native
         |trait MuiTheme extends js.Object
         |
         |@js.native
         |trait MuiThemePalette extends js.Object
         |
         |@js.native
         |@JSImport("@material-ui/styles","createMuiTheme")
         |object CreateMuiTheme extends js.Object {
         |   def apply(options: js.Object): MuiTheme = js.native
         |}
         |
         |@js.native
         |@JSImport("@material-ui/core/styles/createPalette",JSImport.Default)
         |object CreatePalette extends js.Object {
         |   def apply(options: js.Object): MuiThemePalette = js.native
         |}
         |
       """.stripMargin

    Fs.writeFileSync(s"${OUTPUT_PATH}/MuiTheme.scala", content)
  }

  def generateMuiPackageObject() = {

    val content =
      s"""
         |package sri
         |
         |$defaultImports
         |import sri.web.components.materialui.MuiCustomPropTypes
         |
         |package object materialui {
         |
         |  val styleManagerContext =  json(styleManager = MuiCustomPropTypes.muiRequired)
         |
         |}
         |
         |
       """.stripMargin

    Fs.writeFileSync(s"${OUTPUT_PATH}/package.scala", content)
  }

  def generateMuiMiscGlobalTypes() = {

    val content =
      s"""
         |package sri.web.components.materialui
         |
         |$defaultImports
         |
         |
         |@js.native
         |@JSImport("@material-ui/utils/customPropTypes",JSImport.Default)
         |object MuiCustomPropTypes extends js.Object {
         |
 | val muiRequired: js.Any = js.native
         |
 |}
         |
 |
         |abstract class MuiAwareComponent[P >: Null <: AnyRef, S >: Null <: AnyRef]
         |    extends Component[P, S] {
         |
 |  @inline
         |  def styleManager: MuiStyleManager =
         |    context.styleManager.asInstanceOf[MuiStyleManager]
         |
 |}
         |
 |
         |abstract class MuiAwareComponentP[P >: Null <: AnyRef]
         |    extends ComponentP[P] {
         |
 |  @inline
         |  def styleManager: MuiStyleManager =
         |    context.styleManager.asInstanceOf[MuiStyleManager]
         |
 |}
         |
 |
         |abstract class MuiAwareComponentS[S >: Null <: AnyRef]
         |    extends ComponentS[S] {
         |
 |  @inline
         |  def styleManager: MuiStyleManager =
         |    context.styleManager.asInstanceOf[MuiStyleManager]
         |
 |}
         |
 |
 |@js.native
         |trait MuiStyleManager extends js.Object {
         |  val theme : MuiTheme = js.native
         |  val jss: js.Dynamic = js.native
         |}
         |
         |
         |@js.native
         |trait MuiBreakpoint extends js.Object
         |
         |object MuiBreakpoint {
         |
         |  @inline def  XS = "xs".asInstanceOf[MuiBreakpoint]
         |
         |  @inline def  SM = "sm".asInstanceOf[MuiBreakpoint]
         |
         |  @inline def  MD = "md".asInstanceOf[MuiBreakpoint]
         |
         |  @inline def  LG = "lg".asInstanceOf[MuiBreakpoint]
         |
         |  @inline def  XL = "xl".asInstanceOf[MuiBreakpoint]
         |
         |}
         |
         |
       """.stripMargin
    Fs.writeFileSync(s"${OUTPUT_PATH}/MuiMisc.scala", content)

  }

  def run(): Unit = {
    generateMuiPackageObject()
    generateMuiMiscGlobalTypes()
    generateThemes()
    generateComponents()
    generateSVGIcons()
    //    generateMuiColors()
  }
}
