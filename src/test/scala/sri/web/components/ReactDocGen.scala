package sri.web.components

import sri.web.components.materialui.MuiGenerator

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.util.Try

@js.native
@JSImport("react-docgen", JSImport.Namespace)
object ReactDocGenJS extends js.Object {

  def parse(input: String, resolver: js.Any = ???): js.Array[ReactDocGenAST] =
    js.native
  val resolver: js.Dynamic = js.native
}

@js.native
trait ReactDocGenAST extends js.Object {
  val description: String = js.native
  val props: js.Dictionary[ReactProp] = js.native
}

@js.native
trait ReactProp extends js.Object {
  val `type`: js.UndefOr[ReactPropType] = js.native
  val flowType: js.UndefOr[ReactPropType] = js.native
  val required: Boolean = js.native
  val description: String = js.native
}

@js.native
trait ReactPropType extends js.Object {
  val name: String = js.native
  val value: js.Array[js.Dynamic] = js.native
  val raw: String = js.native
  val `type`: js.UndefOr[String] = js.native
  val signature: js.UndefOr[FlowSignature] = js.native
  val elements: js.Array[FlowTypeElement] = js.native
}

@js.native
trait FlowTypeElement extends js.Object {
  val name: String = js.native
  val value: String = js.native
}

@js.native
trait FlowFunctionArgument extends js.Object {
  val name: String = js.native
  val `type`: FlowFunctionArgumentType = js.native
}

@js.native
trait FlowFunctionArgumentType extends js.Object {
  val name: String = js.native
}

@js.native
trait FlowObjectProperty extends js.Object {
  val key: String = js.native
  val value: FlowObjectPropertyValue = js.native
}

@js.native
trait FlowObjectPropertyValue extends js.Object {
  val name: String = js.native
  val nullable: Boolean = js.native
  val required: Boolean = js.native
}

@js.native
trait FlowSignature extends js.Object {
  val arguments: js.UndefOr[js.Array[FlowFunctionArgument]] = js.native
  val properties: js.UndefOr[js.Array[ReactPropType]] = js.native
  val `return`: js.UndefOr[js.Dynamic] = js.native

}

object ReactDocGen extends Common {

  val reactTypesToScalaTypesMap =
    Map(
      "node" -> "ReactNode",
      "string" -> "String",
      "object" -> "js.Object",
      "shape" -> "js.Object",
      "Object" -> "js.Object",
      "any" -> "js.Any",
      "func" -> "js.Function",
      "element" -> "ReactElement",
      "number" -> "Double | Int",
      "bool" -> "Boolean"
    )

  val flowTypesToScalaTypes =
    Map(
      "Element" -> "ReactElement",
      "string" -> "String",
      "Object" -> "js.Object",
      "object" -> "js.Object",
      "Function" -> "js.Function",
      "number" -> "Double | Int",
      "any" -> "js.Any",
      "void" -> "Unit",
      "boolean" -> "Boolean"
    )

  def getScalaFieldForReactPropEnumType(componentName: String,
                                        name: String,
                                        isRequired: Boolean,
                                        enum: js.Array[js.Dynamic],
                                        prefix: String = "") = {
    val scalaEnumName = addPrefix(s"$componentName${name.capitalize}", prefix)
    val customDef =
      s"""
         | @js.native
         | trait $scalaEnumName extends js.Object
         |
         | object $scalaEnumName {
         |   ${enum
           .map(
             v =>
               if (!js.isUndefined(v.name)) v.name.toString.replace("'", "")
               else v.value.toString.replace("'", ""))
           .map(v =>
             s"""@inline def ${getLiteralEnum(v)}.asInstanceOf[$scalaEnumName] """)
           .mkString("\n")}
         | }
         |
       """.stripMargin

    ScalaField(name = name,
               tpe = scalaEnumName,
               isRequired = isRequired,
               customTypeDef = customDef)
  }

  def getLiteralEnum(in: String) = {
    if (Try(in.toInt).isSuccess) s"_${in} = $in"
    else if (Try(in.toDouble).isSuccess) s"_${in.replace(".", "_")} = $in"
    else
      s"""${in.toUpperCase
        .replace("-", "_")} = "${in}""""
  }

  def getScalaFieldForFlowEnumType(componentName: String,
                                   name: String,
                                   isRequired: Boolean,
                                   enum: js.Array[FlowTypeElement],
                                   prefix: String = "") = {
    if (enum.toList.forall(_.name == "literal")) {
      val scalaEnumName =
        addPrefix(s"$componentName${name.capitalize}", prefix)
      val customDef =
        s"""
           | @js.native
           | trait ${scalaEnumName} extends js.Object
           |
         | object $scalaEnumName{
           |   ${enum
             .map(_.value.replace("'", ""))
             .map(v =>
               s"""@inline def ${getLiteralEnum(v)}.asInstanceOf[$scalaEnumName] """)
             .mkString("\n")}
          }
           |""".stripMargin
      ScalaField(name = name,
                 tpe = scalaEnumName,
                 isRequired = isRequired,
                 customTypeDef = customDef)
    } else {
      ScalaField(name = name,
                 tpe = enum
                   .map(_.name)
                   .map(v => flowTypesToScalaTypes.getOrElse(v, v))
                   .mkString(" | "),
                 isRequired = isRequired)
    }
  }

  def convertReactPropEnumToScalaType(componentName: String,
                                      name: String,
                                      isRequired: Boolean,
                                      enum: js.Array[js.Dynamic],
                                      prefix: String = ""): ScalaType = {
    val scalaEnumName = addPrefix(s"$componentName${name.capitalize}", prefix)
    val customDef =
      s"""
         | @js.native
         | trait $scalaEnumName extends js.Object
         |
         | object $scalaEnumName {
         |   ${enum
           .map(
             v =>
               if (!js.isUndefined(v.name)) v.name.toString.replace("'", "")
               else v.value.toString.replace("'", ""))
           .map(v =>
             s"""@inline def ${getLiteralEnum(v)}.asInstanceOf[$scalaEnumName] """)
           .mkString("\n")}
         | }
         |
       """.stripMargin

    ScalaType(name = scalaEnumName, customDef = customDef)
  }

  def convertFlowPropToScalaField(props: ReactPropType) = {}

  def getScalaFieldFromReactOrFlowProp(
      componentName: String,
      name: String,
      prop: ReactProp,
      prefix: String = MuiGenerator.MUI_PREFIX): ScalaField = {
    if (prop.`type`.isDefined) { // react prop-types

      val p = prop.`type`.get
      p.name match {
        case "enum" =>
          getScalaFieldForReactPropEnumType(componentName,
                                            name,
                                            prop.required,
                                            p.value,
                                            prefix)
        case "union" =>
          ScalaField(name = name,
                     tpe = p.value
                       .map(_.name.toString)
                       .map(v => reactTypesToScalaTypesMap.getOrElse(v, v))
                       .mkString(" | "),
                     isRequired = prop.required)
        case v =>
          ScalaField(name = name,
                     tpe = reactTypesToScalaTypesMap.getOrElse(v, v),
                     isRequired = prop.required)
      }

    } else { //flow type

      val p = prop.flowType.get

      p.name match {

        case "union" =>
          getScalaFieldForFlowEnumType(componentName,
                                       name,
                                       prop.required,
                                       p.elements,
                                       prefix)
        case v =>
          ScalaField(name = name,
                     tpe = flowTypesToScalaTypes.getOrElse(v, v),
                     isRequired = prop.required)
      }

    }
  }
}
