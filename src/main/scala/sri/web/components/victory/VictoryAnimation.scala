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
@JSImport("victory", "VictoryAnimation")
object VictoryAnimationComponent extends JSComponent[js.Object] {}

object VictoryAnimation {

  @inline
  def apply(data: OptionalParam[AnimationData] = OptDefault,
            onEnd: OptionalParam[() => Unit] = OptDefault,
            delay: OptionalParam[Double | Int] = OptDefault,
            duration: OptionalParam[Double | Int] = OptDefault,
            easing: OptionalParam[AnimationEasing] = OptDefault,
            @exclude extraProps: OptionalParam[js.Object] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[VictoryAnimationComponent.type, Unit] =
              null)(children: js.Function1[AnimationStyle, ReactElement])
    : ReactElement { type Instance = VictoryAnimationComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[VictoryAnimationComponent.type](
      VictoryAnimationComponent,
      props,
      key,
      ref,
      js.Array(children.asInstanceOf[ReactNode]))
  }
}

object VictoryAnimationC {

  @inline
  def apply(children: js.Function1[AnimationStyle, ReactElement]) = {
    CreateElementJS[VictoryAnimationComponent.type](
      VictoryAnimationComponent,
      json(),
      children = js.Array(children.asInstanceOf[ReactNode]))
  }

}
