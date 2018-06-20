package sri.web.components.victory;
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
import VictoryTypes._

@js.native
@JSImport("victory", "VictoryArea")
object VictoryAreaComponent extends JSComponent[js.Object] {}

object VictoryArea {

  @inline
  def apply(samples: OptionalParam[Double | Int] = OptDefault,
            categories: OptionalParam[CategoryPropType] = OptDefault,
            theme: OptionalParam[VictoryThemeDefinition] = OptDefault,
            standalone: OptionalParam[Boolean] = OptDefault,
            groupComponent: OptionalParam[ReactElement] = OptDefault,
            padding: OptionalParam[js.Any] = OptDefault,
            x: OptionalParam[DataGetterPropType] = OptDefault,
            containerComponent: OptionalParam[js.Any] = OptDefault,
            animate: OptionalParam[AnimateProp | Boolean] = OptDefault,
            data: OptionalParam[js.Array[_]] = OptDefault,
            style: OptionalParam[VictoryStyle] = OptDefault,
            labelComponent: OptionalParam[ReactElement] = OptDefault,
            interpolation: OptionalParam[InterpolationPropType] = OptDefault,
            domain: OptionalParam[js.Any] = OptDefault,
            width: OptionalParam[Double | Int] = OptDefault,
            name: OptionalParam[String] = OptDefault,
            dataComponent: OptionalParam[js.Any] = OptDefault,
            height: OptionalParam[Double | Int] = OptDefault,
            scale: OptionalParam[js.Any] = OptDefault,
            label: OptionalParam[js.Any] = OptDefault,
            y: OptionalParam[DataGetterPropType] = OptDefault,
            events: OptionalParam[js.Any] = OptDefault,
            @exclude extraProps: OptionalParam[js.Object] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryAreaComponent.type, Unit] = null)
    : ReactElement { type Instance = VictoryAreaComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryAreaComponent.type](VictoryAreaComponent,
                                               props,
                                               key,
                                               ref)
  }
}
