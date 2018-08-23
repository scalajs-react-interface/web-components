package sri.web.components.victory

import scalajsplus.{DangerousUnionToJSAnyImplicit, OptDefault, OptionalParam}
import scalajsplus.macros.{FunctionObjectMacro, exclude}
import sri.core.{CreateElementJS, JSComponent, ReactElement}
import sri.universal.MergeJSObjects
import sri.web.components.victory.VictoryTypes.{
  CategoryPropType,
  DataGetterPropType
}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("victory", "VictoryTooltip")
object VictoryTooltipComponent extends JSComponent[js.Object] {
  val defaultEvents: js.Any = js.native
}

object VictoryTooltip {

  @inline
  def apply(active: OptionalParam[Boolean] = OptDefault,
            activateData: OptionalParam[Boolean] = OptDefault,
            renderInPortal: OptionalParam[Boolean] = OptDefault,
            horizontal: OptionalParam[Boolean] = OptDefault,
            angle: OptionalParam[Double | Int] = OptDefault,
            cornerRadius: OptionalParam[Double | Int] = OptDefault,
            data: OptionalParam[js.Array[_]] = OptDefault,
            datum: OptionalParam[js.Object] = OptDefault,
            labels: OptionalParam[js.Any] = OptDefault,
            events: OptionalParam[js.Object] = OptDefault,
            flyoutStyle: OptionalParam[js.Object] = OptDefault,
            style: OptionalParam[js.Object] = OptDefault,
            flyoutComponent: OptionalParam[ReactElement] = OptDefault,
            groupComponent: OptionalParam[ReactElement] = OptDefault,
            labelComponent: OptionalParam[ReactElement] = OptDefault,
            dx: OptionalParam[Double | Int] = OptDefault,
            x: OptionalParam[Double | Int] = OptDefault,
            dy: OptionalParam[Double | Int] = OptDefault,
            y: OptionalParam[Double | Int] = OptDefault,
            width: OptionalParam[Double | Int] = OptDefault,
            height: OptionalParam[Double | Int] = OptDefault,
            pointerLength: OptionalParam[Double | Int] = OptDefault,
            pointerWidth: OptionalParam[Double | Int] = OptDefault,
            index: OptionalParam[Int | String] = OptDefault,
            text: OptionalParam[String] = OptDefault,
            orientation: OptionalParam[String] = OptDefault,
            @exclude extraProps: OptionalParam[js.Object] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryTooltipComponent.type, Unit] =
              null)
    : ReactElement { type Instance = VictoryTooltipComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryTooltipComponent.type](VictoryTooltipComponent,
                                                  props,
                                                  key,
                                                  ref)
  }
}
