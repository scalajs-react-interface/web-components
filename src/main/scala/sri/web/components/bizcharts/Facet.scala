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
@JSImport("bizcharts", "Facet")
object FacetComponent extends JSComponent[js.Object] {}

object Facet {

  @inline
  def apply(
      autoSetAxis: OptionalParam[Boolean] = OptDefault,
      margin: OptionalParam[js.Any] = OptDefault,
      `type`: OptionalParam[FacetType] = OptDefault,
      padding: OptionalParam[js.Any] = OptDefault,
      eachView: OptionalParam[js.Any] = OptDefault,
      showTitle: OptionalParam[Boolean] = OptDefault,
      fields: OptionalParam[js.Any] = OptDefault,
      rowTitle: OptionalParam[js.Object {
        val offsetX: js.UndefOr[Double | Int]; val style: js.UndefOr[js.Any]
      }] = OptDefault,
      colTitle: OptionalParam[js.Object {
        val offsetY: js.UndefOr[Double | Int]; val style: js.UndefOr[js.Any]
      }] = OptDefault,
      @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[FacetComponent.type, Unit] = null)
    : ReactElement { type Instance = FacetComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[FacetComponent.type](FacetComponent, props, key, ref)
  }
}
