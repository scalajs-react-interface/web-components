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
@JSImport("bizcharts", "View")
object ViewComponent extends JSComponent[js.Object] {}

object View {

  @inline
  def apply(
      id: OptionalParam[String] = OptDefault,
      scale: OptionalParam[js.Object { val FIX_MY_NAME: js.Any }] = OptDefault,
      start: OptionalParam[
        js.Object { val x: Double | Int; val y: Double | Int }] = OptDefault,
      data: OptionalParam[js.Any] = OptDefault,
      animate: OptionalParam[Boolean] = OptDefault,
      filter: OptionalParam[Array[js.Any]] = OptDefault,
      end: OptionalParam[js.Object { val x: Double | Int; val y: Double | Int }] =
        OptDefault,
      @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[ViewComponent.type, Unit] = null)
    : ReactElement { type Instance = ViewComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[ViewComponent.type](ViewComponent, props, key, ref)
  }
}
