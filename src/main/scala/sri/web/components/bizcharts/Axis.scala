package sri.web.components.bizcharts;

import sri.core._
import scalajsplus.macros.{FunctionObjectMacro, exclude, rename}
import scalajsplus._
import sri.universal._
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.vdom.ReactEventAliases._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
@js.native
@JSImport("bizcharts", "Axis")
object AxisComponent extends JSComponent[js.Object] {}

object Axis {

  @inline
  def apply(label: OptionalParam[AxisLabel] = OptDefault,
            title: OptionalParam[js.Any] = OptDefault,
            line: OptionalParam[js.Any] = OptDefault,
            subTickCount: OptionalParam[Double | Int] = OptDefault,
            name: OptionalParam[String] = OptDefault,
            position: OptionalParam[Position] = OptDefault,
            tickLine: OptionalParam[js.Any] = OptDefault,
            grid: OptionalParam[js.Any] = OptDefault,
            subTickLine: OptionalParam[js.Any] = OptDefault,
            visible: OptionalParam[Boolean] = OptDefault,
            @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[AxisComponent.type, Unit] = null)
    : ReactElement { type Instance = AxisComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[AxisComponent.type](AxisComponent, props, key, ref)
  }
}

trait AxisLabel extends js.Object

object AxisLabel {

  @inline def apply(
      offset: OptionalParam[Int | Double] = OptDefault,
      autoRotate: OptionalParam[Boolean] = OptDefault,
      formatter: OptionalParam[(String, js.Object, Int) => String] = OptDefault,
      htmlTemplate: OptionalParam[(String, js.Object, Int) => String] =
        OptDefault,
      textStyle: OptionalParam[js.Any] = OptDefault): AxisLabel = {
    import DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[AxisLabel]
  }
}
