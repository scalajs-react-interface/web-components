package sri.web.components.bizcharts;

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
@JSImport("bizcharts", "Chart")
object ChartComponent extends JSComponent[js.Object] {}

object Chart {

  @inline
  def apply(className: OptionalParam[String] = OptDefault,
            plotBackground: OptionalParam[js.Any] = OptDefault,
            style: OptionalParam[js.Any] = OptDefault,
            background: OptionalParam[js.Any] = OptDefault,
            padding: OptionalParam[js.Any] = OptDefault,
            data: OptionalParam[js.Any] = OptDefault,
            height: Double | Int,
            animate: OptionalParam[Boolean] = OptDefault,
            placeholder: OptionalParam[js.Any] = OptDefault,
            width: OptionalParam[Double | Int] = OptDefault,
            pixelRatio: OptionalParam[Double | Int] = OptDefault,
            filter: OptionalParam[Array[js.Any]] = OptDefault,
            forceFit: OptionalParam[Boolean] = OptDefault,
            scale: OptionalParam[js.Any] = OptDefault,
            @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[ChartComponent.type, Unit] = null)(
      children: ReactElementNode*)
    : ReactElement { type Instance = ChartComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ChartComponent.type](ChartComponent,
                                         props,
                                         key,
                                         ref,
                                         children = children.toJSArray)
  }
}
