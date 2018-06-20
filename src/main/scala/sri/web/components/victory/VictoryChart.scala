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
@JSImport("victory", "VictoryChart")
object VictoryChartComponent extends JSComponent[js.Object] {}

object VictoryChart {

  @inline
  def apply(
      theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
      eventKey: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault,
      standalone: OptionalParam[Boolean] = OptDefault,
      groupComponent: OptionalParam[ReactElement] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      containerComponent: OptionalParam[ReactElement] = OptDefault,
      animate: OptionalParam[AnimateProp | Boolean] = OptDefault,
      domain: OptionalParam[js.Any] = OptDefault,
      domainPadding: OptionalParam[DomainPaddingPropType] = OptDefault,
      width: OptionalParam[Double | Int] = OptDefault,
      name: OptionalParam[String] = OptDefault,
      height: OptionalParam[Double | Int] = OptDefault,
      scale: OptionalParam[js.Any] = OptDefault,
      events: OptionalParam[js.Any] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryChartComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = VictoryChartComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryChartComponent.type](VictoryChartComponent,
                                                props,
                                                key,
                                                ref,
                                                children = children.toJSArray)
  }
}
