package sri.web.components.victory;

import sri.core._
import scalajsplus.macros.{FunctionObjectMacro, exclude, rename}
import scalajsplus._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.components.victory.VictoryThemeDefinition
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
@js.native
@JSImport("victory", "VictoryAxis")
object VictoryAxisComponent extends JSComponent[js.Object] {}

object VictoryAxis {

  @inline
  def apply[T](
      style: OptionalParam[VictoryStyle] = OptDefault,
      tickLabelComponent: OptionalParam[js.Any] = OptDefault,
      theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
      crossAxis: OptionalParam[Boolean] = OptDefault,
      tickCount: OptionalParam[Double | Int] = OptDefault,
      axisLabelComponent: OptionalParam[js.Any] = OptDefault,
      gridComponent: OptionalParam[js.Any] = OptDefault,
      axisComponent: OptionalParam[js.Any] = OptDefault,
      standalone: OptionalParam[Boolean] = OptDefault,
      groupComponent: OptionalParam[js.Any] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      orientation: OptionalParam[js.Any] = OptDefault,
      dependentAxis: OptionalParam[Boolean] = OptDefault,
      containerComponent: OptionalParam[js.Any] = OptDefault,
      animate: OptionalParam[AnimateProp | Boolean] = OptDefault,
      invertAxis: OptionalParam[Boolean] = OptDefault,
      domain: OptionalParam[js.Any] = OptDefault,
      width: OptionalParam[Double | Int] = OptDefault,
      offsetY: OptionalParam[Double | Int] = OptDefault,
      tickComponent: OptionalParam[js.Any] = OptDefault,
      offsetX: OptionalParam[Double | Int] = OptDefault,
      name: OptionalParam[String] = OptDefault,
      height: OptionalParam[Double | Int] = OptDefault,
      tickValues: OptionalParam[js.Array[T]] = OptDefault,
      tickFormat: OptionalParam[Function2[T, Int, _]] = OptDefault,
      @rename("tickFormat") tickFormatArray: OptionalParam[js.Array[_]] =
        OptDefault,
      scale: OptionalParam[js.Any] = OptDefault,
      label: OptionalParam[js.Any] = OptDefault,
      events: OptionalParam[js.Any] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryAxisComponent.type, Unit] = null)
    : ReactElement { type Instance = VictoryAxisComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryAxisComponent.type](VictoryAxisComponent,
                                               props,
                                               key,
                                               ref)
  }

}
