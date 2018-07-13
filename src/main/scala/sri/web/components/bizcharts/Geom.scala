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
@JSImport("bizcharts", "Geom")
object GeomComponent extends JSComponent[js.Object] {}

object Geom {
  @inline
  def apply(
      active: OptionalParam[Boolean] = OptDefault,
      shape: OptionalParam[String | js.Tuple2[String, js.Array[String]]] =
        OptDefault,
      adjust: OptionalParam[String | js.Array[String] | js.Array[GeomAdjust]] =
        OptDefault,
      color: OptionalParam[String | js.Tuple2[String, String] | js.Tuple2[
        String,
        js.Array[String]] | js.Tuple2[String, js.Function]] = OptDefault,
      position: OptionalParam[String] = OptDefault,
      select: OptionalParam[js.Any] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault,
      tooltip: OptionalParam[js.Any] = OptDefault,
      opacity: OptionalParam[js.Any] = OptDefault,
      `type`: OptionalParam[GeomType] = OptDefault,
      animate: OptionalParam[js.Any] = OptDefault,
      size: OptionalParam[
        Int | String | js.Tuple2[String, js.Tuple2[Int, Int]] | js.Tuple2[
          String,
          js.Function]] = OptDefault,
      @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[GeomComponent.type, Unit] = null)(
      children: ReactElementNode*)
    : ReactElement { type Instance = GeomComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[GeomComponent.type](GeomComponent,
                                        props,
                                        key,
                                        ref,
                                        children = children.toJSArray)
  }
}

trait GeomAdjust extends js.Object

object GeomAdjust {

  @inline def apply(`type`: OptionalParam[GeomAdjustType] = OptDefault,
                    marginRatio: OptionalParam[Double | Int] = OptDefault,
                    dodgeBy: OptionalParam[String] = OptDefault): GeomAdjust = {
    import DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[GeomAdjust]
  }
}
