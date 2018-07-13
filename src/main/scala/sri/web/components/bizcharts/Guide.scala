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
@JSImport("bizcharts", "Guide")
object GuideComponent extends JSComponent[js.Object] {
  @js.native
  object Html extends JSComponent[js.Object]
//  val Html: ComponentConstructor { type ComponentType = Html } = js.native
}

object Guide {

  @inline
  def apply(@exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[GuideComponent.type, Unit] = null)(
      children: ReactElementNode*)
    : ReactElement { type Instance = GuideComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[GuideComponent.type](GuideComponent,
                                         props,
                                         key,
                                         ref,
                                         children = children.toJSArray)
  }
}

object GuideHtml {

  @inline
  def apply(position: OptionalParam[js.Any] = OptDefault,
            alignX: OptionalParam[AlignX] = OptDefault,
            alignY: OptionalParam[AlignY] = OptDefault,
            html: OptionalParam[String] = OptDefault,
            zIndex: OptionalParam[Int] = OptDefault,
            offsetX: OptionalParam[Double | Int] = OptDefault,
            offsetY: OptionalParam[Double | Int] = OptDefault,
            @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null)
    : ReactElement { type Instance = GuideComponent.Html.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[GuideComponent.Html.type](GuideComponent.Html, props, key)
  }
}
