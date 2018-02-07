
package sri.web.components.materialui;


import sri.core._
import scalajsplus.macros.{
  FunctionObjectMacro,
  exclude,
  rename
}
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
 @JSImport("material-ui/Modal",JSImport.Default)
object MuiModalComponent extends JSComponent[js.Object] {

 }

 object MuiModal {

    @inline
    def apply(keepMounted : OptionalParam[Boolean] = OptDefault,
id : OptionalParam[String] = OptDefault,
disableEscapeKeyDown : OptionalParam[Boolean] = OptDefault,
manager : OptionalParam[js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
onBackdropClick : OptionalParam[js.Function] = OptDefault,
BackdropComponent : OptionalParam[String | js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
disableBackdropClick : OptionalParam[Boolean] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
disableRestoreFocus : OptionalParam[Boolean] = OptDefault,
onEscapeKeyDown : OptionalParam[js.Function] = OptDefault,
onRendered : OptionalParam[js.Function] = OptDefault,
onClose : OptionalParam[js.Function] = OptDefault,
disableEnforceFocus : OptionalParam[Boolean] = OptDefault,
disableAutoFocus : OptionalParam[Boolean] = OptDefault,
hideBackdrop : OptionalParam[Boolean] = OptDefault,
container : OptionalParam[js.Object | js.Function] = OptDefault,
open : Boolean,
BackdropProps : OptionalParam[js.Object] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiModalComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiModalComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiModalComponent.type](
      MuiModalComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

         


     

         