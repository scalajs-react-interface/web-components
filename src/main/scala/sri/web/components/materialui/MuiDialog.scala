
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
 @JSImport("@material-ui/core/Dialog",JSImport.Default)
object MuiDialogComponent extends JSComponent[js.Object] {

 }

 object MuiDialog {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
disableEscapeKeyDown : OptionalParam[Boolean] = OptDefault,
fullWidth : OptionalParam[Boolean] = OptDefault,
transitionDuration : OptionalParam[Double | Int | js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
onExit : OptionalParam[(ReactEventH) => _] = OptDefault,
TransitionProps : OptionalParam[js.Object] = OptDefault,
maxWidth : OptionalParam[MuiDialogMaxWidth] = OptDefault,
TransitionComponent : OptionalParam[String | js.Function] = OptDefault,
onEnter : OptionalParam[(ReactEventH) => _] = OptDefault,
fullScreen : OptionalParam[Boolean] = OptDefault,
PaperProps : OptionalParam[js.Object] = OptDefault,
onEscapeKeyUp : OptionalParam[(ReactEventH) => _] = OptDefault,
onBackdropClick : OptionalParam[(ReactEventH) => _] = OptDefault,
onRequestClose : OptionalParam[(ReactEventH) => _] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
disableBackdropClick : OptionalParam[Boolean] = OptDefault,
onExited : OptionalParam[(ReactEventH) => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onExiting : OptionalParam[(ReactEventH) => _] = OptDefault,
onEntering : OptionalParam[(ReactEventH) => _] = OptDefault,
onEscapeKeyDown : OptionalParam[js.Function] = OptDefault,
onClose : OptionalParam[js.Function] = OptDefault,
onEntered : OptionalParam[(ReactEventH) => _] = OptDefault,
open : Boolean,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiDialogComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiDialogComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiDialogComponent.type](
      MuiDialogComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

         
 @js.native
 trait MuiDialogMaxWidth extends js.Object

 object MuiDialogMaxWidth {
   @inline def XS = "xs".asInstanceOf[MuiDialogMaxWidth] 
@inline def SM = "sm".asInstanceOf[MuiDialogMaxWidth] 
@inline def MD = "md".asInstanceOf[MuiDialogMaxWidth] 
@inline def FALSE = "false".asInstanceOf[MuiDialogMaxWidth] 
 }

       


     

         