package sri.web.components.materialui;

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
@JSImport("@material-ui/core/Menu", JSImport.Default)
object MuiMenuComponent extends JSComponent[js.Object] {}

object MuiMenu {

  @inline
  def apply(id: OptionalParam[String] = OptDefault,
            onEntered: OptionalParam[dom.Element => _] = OptDefault,
            onRequestClose: OptionalParam[ReactEventH => _] = OptDefault,
            className: OptionalParam[String] = OptDefault,
            onEntering: OptionalParam[dom.Element => _] = OptDefault,
            onEnter: OptionalParam[dom.Element => _] = OptDefault,
            onExit: OptionalParam[dom.Element => _] = OptDefault,
            PopoverClasses: OptionalParam[js.Object] = OptDefault,
            onClick: OptionalParam[ReactEventH => _] = OptDefault,
            transformOrigin: OptionalParam[js.Object] = OptDefault,
            anchorOrigin: OptionalParam[js.Object] = OptDefault,
            style: OptionalParam[js.Any] = OptDefault,
            transitionDuration: OptionalParam[Double | Int | String] =
              OptDefault,
            anchorEl: OptionalParam[dom.Element] = OptDefault,
            onClose: OptionalParam[ReactEventH => _] = OptDefault,
            onExited: OptionalParam[dom.Element => _] = OptDefault,
            onExiting: OptionalParam[dom.Element => _] = OptDefault,
            MenuListProps: OptionalParam[js.Object] = OptDefault,
            open: Boolean,
            classes: OptionalParam[js.Object] = OptDefault,
            @exclude extraProps: OptionalParam[DOMProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[MuiMenuComponent.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = MuiMenuComponent.type } = {
    import DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiMenuComponent.type](MuiMenuComponent,
                                           props,
                                           key,
                                           ref,
                                           children.toJSArray)
  }
}
