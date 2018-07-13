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
@JSImport("bizcharts", "Legend")
object LegendComponent extends JSComponent[js.Object] {}

object Legend {

  @inline
  def apply(itemFormatter: OptionalParam[js.Any] = OptDefault,
            itemGap: OptionalParam[Double | Int] = OptDefault,
            clickable: OptionalParam[Boolean] = OptDefault,
            itemWidth: OptionalParam[Double | Int] = OptDefault,
            background: OptionalParam[js.Any] = OptDefault,
            unChecked: OptionalParam[String] = OptDefault,
            container: OptionalParam[String] = OptDefault,
            itemMarginBottom: OptionalParam[Double | Int] = OptDefault,
            allowAllCanceled: OptionalParam[Boolean] = OptDefault,
            useHtml: OptionalParam[Boolean] = OptDefault,
            selectedMode: OptionalParam[js.Any] = OptDefault,
            title: OptionalParam[Boolean] = OptDefault,
            onClick: OptionalParam[js.Any] = OptDefault,
            custom: OptionalParam[Boolean] = OptDefault,
            slidable: OptionalParam[Boolean] = OptDefault,
            containerTpl: OptionalParam[String] = OptDefault,
//[object Object] : OptionalParam[js.Any] = OptDefault,
            width: OptionalParam[Double | Int] = OptDefault,
            offsetY: OptionalParam[Double | Int] = OptDefault,
            itemTpl: OptionalParam[js.Any] = OptDefault,
            offsetX: OptionalParam[Double | Int] = OptDefault,
            hoverable: OptionalParam[Boolean] = OptDefault,
            onHover: OptionalParam[js.Any] = OptDefault,
            name: OptionalParam[String] = OptDefault,
            textStyle: OptionalParam[js.Any] = OptDefault,
            height: OptionalParam[Double | Int] = OptDefault,
            position: OptionalParam[Position] = OptDefault,
            marker: OptionalParam[js.Any] = OptDefault,
            scroll: OptionalParam[Boolean] = OptDefault,
            items: OptionalParam[js.Any] = OptDefault,
            visible: OptionalParam[String] = OptDefault,
            @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[LegendComponent.type, Unit] = null)
    : ReactElement { type Instance = LegendComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[LegendComponent.type](LegendComponent, props, key, ref)
  }
}
