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
@JSImport("victory", "VictoryLabel")
object VictoryLabelComponent extends JSComponent[js.Object] {}

object VictoryLabel {

  @inline
  def apply(
      transform: OptionalParam[js.Any] = OptDefault,
      angle: OptionalParam[js.Any] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault,
      text: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      events: OptionalParam[js.Any] = OptDefault,
      x: OptionalParam[Double | Int] = OptDefault,
      lineHeight: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      data: OptionalParam[js.Any] = OptDefault,
      textAnchor: OptionalParam[js.Any] = OptDefault,
      datum: OptionalParam[js.Object {}] = OptDefault,
      dx: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      verticalAnchor: OptionalParam[js.Any] = OptDefault,
      dy: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      y: OptionalParam[Double | Int] = OptDefault,
      capHeight: OptionalParam[StringOrNumberOrCallback] = OptDefault,
      @exclude extraProps: OptionalParam[js.Object] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryLabelComponent.type, Unit] = null)(
      children: StringOrNumberOrCallback)
    : ReactElement { type Instance = VictoryLabelComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryLabelComponent.type](
      VictoryLabelComponent,
      props,
      key,
      ref,
      js.Array(children.asInstanceOf[ReactNode]))
  }
}

object VictoryLabelC {

  @inline
  def apply(children: ReactNode*) = {
    CreateElementJS[VictoryLabelComponent.type](VictoryLabelComponent,
                                                json(),
                                                children = children.toJSArray)
  }

}
