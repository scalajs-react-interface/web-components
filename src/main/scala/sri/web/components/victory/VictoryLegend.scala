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
@JSImport("victory", "VictoryLegend")
object VictoryLegendComponent extends JSComponent[js.Object] {}

object VictoryLegend {

  @inline
  def apply(
      itemsPerRow: OptionalParam[Double | Int] = OptDefault,
      categories: OptionalParam[CategoryPropType] = OptDefault,
      theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
      standalone: OptionalParam[Boolean] = OptDefault,
      x: OptionalParam[Double | Int] = OptDefault,
      groupComponent: OptionalParam[ReactElement] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      orientation: OptionalParam[js.Any] = OptDefault,
      data: OptionalParam[js.Array[VictoryLegendData]] = OptDefault,
      colorScale: OptionalParam[ColorScaleProp] = OptDefault,
      containerComponent: OptionalParam[ReactElement] = OptDefault,
      animate: OptionalParam[AnimateProp | Boolean] = OptDefault,
      style: OptionalParam[VictoryStyle] = OptDefault,
      labelComponent: OptionalParam[ReactElement] = OptDefault,
      domain: OptionalParam[js.Any] = OptDefault,
      width: OptionalParam[Double | Int] = OptDefault,
      name: OptionalParam[String] = OptDefault,
      dataComponent: OptionalParam[ReactElement] = OptDefault,
      gutter: OptionalParam[Double | Int] = OptDefault,
      height: OptionalParam[Double | Int] = OptDefault,
      scale: OptionalParam[js.Any] = OptDefault,
      label: OptionalParam[js.Any] = OptDefault,
      y: OptionalParam[Double | Int] = OptDefault,
      symbolSpacer: OptionalParam[Double | Int] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryLegendComponent.type, Unit] = null)
    : ReactElement { type Instance = VictoryLegendComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryLegendComponent.type](VictoryLegendComponent,
                                                 props,
                                                 key,
                                                 ref)
  }
}

trait VictoryLegendData extends js.Object

object VictoryLegendData {

  @inline def apply(
      name: OptionalParam[String] = OptDefault,
      symbol: OptionalParam[js.Object] = OptDefault,
      labels: OptionalParam[js.Object] = OptDefault
  ): VictoryLegendData = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryLegendData]
  }
}
