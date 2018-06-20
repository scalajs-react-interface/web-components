package sri.web.components.victory;

import sri.core._
import scalajsplus.macros.{FunctionObjectMacro, exclude, rename}
import scalajsplus._
import sri.universal._

import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.components.victory.VictoryTypes._
import sri.web.vdom.ReactEventAliases._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
@js.native
@JSImport("victory", "VictoryPie")
object VictoryPieComponent extends JSComponent[js.Object] {}

object VictoryPie {

  @inline
  def apply[D](
      labels: OptionalParam[D => _] = OptDefault,
      @rename("labels") labelsArray: OptionalParam[js.Array[String]] =
        OptDefault,
      theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
      eventKey: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      padAngle: OptionalParam[Double | Int] = OptDefault,
      labelRadius: OptionalParam[Double | Int] = OptDefault,
      standalone: OptionalParam[Boolean] = OptDefault,
      groupComponent: OptionalParam[ReactElement] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      cornerRadius: OptionalParam[Double | Int] = OptDefault,
      colorScale: OptionalParam[ColorScaleProp] = OptDefault,
      x: OptionalParam[DataGetterPropType] = OptDefault,
      containerComponent: OptionalParam[js.Any] = OptDefault,
      animate: OptionalParam[Boolean | AnimateProp] = OptDefault,
      data: OptionalParam[js.Array[D]] = OptDefault,
      style: OptionalParam[VictoryStyle] = OptDefault,
      labelComponent: OptionalParam[ReactElement] = OptDefault,
      width: OptionalParam[Double | Int] = OptDefault,
      endAngle: OptionalParam[Double | Int] = OptDefault,
      name: OptionalParam[String] = OptDefault,
      dataComponent: OptionalParam[ReactElement] = OptDefault,
      height: OptionalParam[Double | Int] = OptDefault,
      innerRadius: OptionalParam[Double | Int] = OptDefault,
      startAngle: OptionalParam[Double | Int] = OptDefault,
      scale: OptionalParam[js.Any] = OptDefault,
      y: OptionalParam[DataGetterPropType] = OptDefault,
      events: OptionalParam[js.Any] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryPieComponent.type, Unit] = null)
    : ReactElement { type Instance = VictoryPieComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryPieComponent.type](VictoryPieComponent,
                                              props,
                                              key,
                                              ref)
  }
}
