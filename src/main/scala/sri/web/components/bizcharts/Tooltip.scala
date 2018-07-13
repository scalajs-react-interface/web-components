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
@JSImport("bizcharts", "Tooltip")
object TooltipComponent extends JSComponent[js.Object] {}

object Tooltip {

  @inline
  def apply(shared: OptionalParam[Boolean] = OptDefault,
            crosshairs: OptionalParam[TooltipCrosshairs] = OptDefault,
            offset: OptionalParam[Double | Int] = OptDefault,
            inPlot: OptionalParam[Boolean] = OptDefault,
            follow: OptionalParam[Boolean] = OptDefault,
            containerTpl: OptionalParam[String] = OptDefault,
//[object Object] : OptionalParam[FIX_MY_NAME] = OptDefault,
            showTitle: OptionalParam[Boolean] = OptDefault,
            position: OptionalParam[Position] = OptDefault,
            itemTpl: OptionalParam[String] = OptDefault,
            @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[TooltipComponent.type, Unit] = null)
    : ReactElement { type Instance = TooltipComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[TooltipComponent.type](TooltipComponent, props, key, ref)
  }
}

trait TooltipCrosshairs extends js.Object

object TooltipCrosshairs {

  @inline def apply(
      `type`: OptionalParam[CrosshairsType] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault): TooltipCrosshairs = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[TooltipCrosshairs]
  }
}
