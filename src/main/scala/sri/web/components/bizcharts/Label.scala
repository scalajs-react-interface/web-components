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
@JSImport("bizcharts", "Label")
object LabelComponent extends JSComponent[js.Object] {}
object Label {

  @inline
  def apply[FV, FI, FIND](
      content: OptionalParam[String | js.Tuple2[
        String,
        js.Function2[Any, Any, String]]] = OptDefault,
      textStyle: OptionalParam[js.Any] = OptDefault,
      offset: OptionalParam[Double | Int] = OptDefault,
      autoRotate: OptionalParam[Boolean] = OptDefault,
      labelLine: OptionalParam[js.Any] = OptDefault,
      formatter: OptionalParam[(FV, FI, Int) => String] = OptDefault,
      htmlTemplate: OptionalParam[js.Any] = OptDefault,
      @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[LabelComponent.type, Unit] = null)
    : ReactElement { type Instance = LabelComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[LabelComponent.type](LabelComponent, props, key, ref)
  }
}
