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
@JSImport("victory", "VictoryBar")
object VictoryBarComponent extends JSComponent[js.Object] {}

object VictoryBar {

  @inline
  def apply[D <: js.Object](
      categories: OptionalParam[CategoryPropType] = OptDefault,
      labels: OptionalParam[D => _] = OptDefault,
      @rename("labels") labelsArray: OptionalParam[js.Array[String]] =
        OptDefault,
      theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
      eventKey: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      standalone: OptionalParam[Boolean] = OptDefault,
      groupComponent: OptionalParam[js.Any] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      x: OptionalParam[DataGetterPropType] = OptDefault,
      containerComponent: OptionalParam[js.Any] = OptDefault,
      animate: OptionalParam[AnimateProp | Boolean] = OptDefault,
      data: OptionalParam[js.Array[D]] = OptDefault,
      style: OptionalParam[VictoryStyle] = OptDefault,
      labelComponent: OptionalParam[js.Any] = OptDefault,
      domain: OptionalParam[js.Any] = OptDefault,
      width: OptionalParam[Double | Int] = OptDefault,
      name: OptionalParam[String] = OptDefault,
      dataComponent: OptionalParam[js.Any] = OptDefault,
      height: OptionalParam[Double | Int] = OptDefault,
      horizontal: OptionalParam[Boolean] = OptDefault,
      scale: OptionalParam[js.Any] = OptDefault,
      y: OptionalParam[DataGetterPropType] = OptDefault,
      events: OptionalParam[DataGetterPropType] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryBarComponent.type, Unit] = null)
    : ReactElement { type Instance = VictoryBarComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryBarComponent.type](VictoryBarComponent,
                                              props,
                                              key,
                                              ref)
  }
}
