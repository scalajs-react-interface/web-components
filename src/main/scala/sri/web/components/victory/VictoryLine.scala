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
@JSImport("victory", "VictoryLine")
object VictoryLineComponent extends JSComponent[js.Object] {}

object VictoryLine {

  @inline
  def apply[D <: js.Object](
      samples: OptionalParam[Double | Int] = OptDefault,
      categories: OptionalParam[CategoryPropType] = OptDefault,
      labels: OptionalParam[D => _] = OptDefault,
      @rename("labels") labelsArray: OptionalParam[js.Any] = OptDefault,
      theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
      standalone: OptionalParam[Boolean] = OptDefault,
      groupComponent: OptionalParam[ReactElement] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      x: OptionalParam[DataGetterPropType] = OptDefault,
      containerComponent: OptionalParam[ReactElement] = OptDefault,
      animate: OptionalParam[AnimateProp | Boolean] = OptDefault,
      data: OptionalParam[js.Array[D]] = OptDefault,
      style: OptionalParam[VictoryStyle] = OptDefault,
      labelComponent: OptionalParam[ReactElement] = OptDefault,
      interpolation: OptionalParam[InterpolationPropType] = OptDefault,
      domain: OptionalParam[js.Any] = OptDefault,
      width: OptionalParam[Double | Int] = OptDefault,
      name: OptionalParam[String] = OptDefault,
      dataComponent: OptionalParam[ReactElement] = OptDefault,
      sortKey: OptionalParam[js.Any] = OptDefault,
      height: OptionalParam[Double | Int] = OptDefault,
      scale: OptionalParam[js.Any] = OptDefault,
      label: OptionalParam[js.Any] = OptDefault,
      y: OptionalParam[DataGetterPropType] = OptDefault,
      events: OptionalParam[js.Any] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryLineComponent.type, Unit] = null)
    : ReactElement { type Instance = VictoryLineComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryLineComponent.type](VictoryLineComponent,
                                               props,
                                               key,
                                               ref)
  }
}
