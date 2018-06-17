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
@js.native
@JSImport("victory", "VictoryContainer")
object VictoryContainerComponent extends JSComponent[js.Object] {}

object VictoryContainer {

  @inline
  def apply(desc: OptionalParam[String] = OptDefault,
            style: OptionalParam[js.Any] = OptDefault,
            events: OptionalParam[js.Any] = OptDefault,
            width: OptionalParam[Double | Int] = OptDefault,
            height: OptionalParam[Double | Int] = OptDefault,
            title: OptionalParam[String] = OptDefault,
            @exclude extraProps: OptionalParam[js.Object] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryContainerComponent.type, Unit] =
              null)
    : ReactElement { type Instance = VictoryContainerComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryContainerComponent.type](VictoryContainerComponent,
                                                    props,
                                                    key,
                                                    ref)
  }
}
