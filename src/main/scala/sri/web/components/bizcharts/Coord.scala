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
@JSImport("bizcharts", "Coord")
object CoordComponent extends JSComponent[js.Object] {}

object Coord {

  @inline
  def apply(reflect: OptionalParam[js.Any] = OptDefault,
            transpose: OptionalParam[Boolean] = OptDefault,
            radius: OptionalParam[Double | Int] = OptDefault,
            `type`: OptionalParam[CoordType] = OptDefault,
            endAngle: OptionalParam[Double | Int] = OptDefault,
            rotate: OptionalParam[Double | Int] = OptDefault,
            innerRadius: OptionalParam[Double | Int] = OptDefault,
            startAngle: OptionalParam[Double | Int] = OptDefault,
            scale: OptionalParam[js.Tuple2[Int, Int]] = OptDefault,
            @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[CoordComponent.type, Unit] = null)
    : ReactElement { type Instance = CoordComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[CoordComponent.type](CoordComponent, props, key, ref)
  }
}
