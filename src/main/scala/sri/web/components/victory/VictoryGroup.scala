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
@JSImport("victory", "VictoryGroup")
object VictoryGroupComponent extends JSComponent[js.Object] {}

object VictoryGroup {

  @inline
  def apply(
      categories: OptionalParam[CategoryPropType] = OptDefault,
      labels: OptionalParam[js.Any] = OptDefault,
      theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
      eventKey: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      standalone: OptionalParam[Boolean] = OptDefault,
      groupComponent: OptionalParam[ReactElement] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      colorScale: OptionalParam[ColorScaleProp] = OptDefault,
      containerComponent: OptionalParam[ReactElement] = OptDefault,
      animate: OptionalParam[AnimateProp | Boolean] = OptDefault,
      style: OptionalParam[VictoryStyle] = OptDefault,
      labelComponent: OptionalParam[ReactElement] = OptDefault,
      domain: OptionalParam[js.Any] = OptDefault,
      data: OptionalParam[js.Any] = OptDefault,
      domainPadding: OptionalParam[js.Any] = OptDefault,
      width: OptionalParam[Double | Int] = OptDefault,
      name: OptionalParam[String] = OptDefault,
      height: OptionalParam[Double | Int] = OptDefault,
      horizontal: OptionalParam[Boolean] = OptDefault,
      scale: OptionalParam[js.Any] = OptDefault,
      events: OptionalParam[js.Any] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryGroupComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = VictoryGroupComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryGroupComponent.type](VictoryGroupComponent,
                                                props,
                                                key,
                                                ref,
                                                children = children.toJSArray)
  }
}
