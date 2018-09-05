package sri.web.components.victory

import scalajsplus.macros.{FunctionObjectMacro, exclude}
import scalajsplus.{OptDefault => NoValue, OptionalParam => OP}
import sri.core.{CreateElementJSNoInline, JSComponent, ReactElement, ReactNode}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("victory", "VictoryVoronoiContainer")
object VictoryVoronoiContainerComponent extends JSComponent[js.Object]

object VictoryVoronoiContainer {
  @inline
  def apply(
      width: OP[Int] = NoValue,
      labels: OP[js.Any] = NoValue,
      activateData: OP[Boolean] = NoValue,
      activateLabels: OP[Boolean] = NoValue,
      disable: OP[Boolean] = NoValue,
      radius: OP[Double | Int] = NoValue,
      voronoiPadding: OP[Double | Int] = NoValue,
      voronoiBlacklist: OP[js.Array[String]] = NoValue,
      voronoiDimension: OP[String] = NoValue,
      labelComponent: OP[ReactElement] = NoValue,
      onActivated: OP[(js.Array[js.Object], js.Object) => _] = NoValue,
      onDeactivated: OP[(js.Array[js.Object], js.Object) => _] = NoValue,
      @exclude extraProps: OP[js.Object] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[VictoryVoronoiContainerComponent.type, Unit] =
        null)(children: ReactNode*)
    : ReactElement { type Instance = VictoryVoronoiContainerComponent.type } = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    Seq(extraProps).foreach(i =>
      i.foreach(v => {
        MergeJSObjects(props, v)
      }))
    CreateElementJSNoInline[VictoryVoronoiContainerComponent.type](
      VictoryVoronoiContainerComponent,
      props,
      key,
      ref,
      children.toJSArray)
  }
}
