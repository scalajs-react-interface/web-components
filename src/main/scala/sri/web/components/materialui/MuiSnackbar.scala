
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
 @JSImport("@material-ui/core/Snackbar",JSImport.Default)
object MuiSnackbarComponent extends JSComponent[js.Object] {

 }

 object MuiSnackbar {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
transitionDuration : OptionalParam[Double | Int | js.Object] = OptDefault,
disableWindowBlurListener : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
TransitionProps : OptionalParam[js.Object] = OptDefault,
autoHideDuration : OptionalParam[Double | Int] = OptDefault,
onRequestClose : OptionalParam[(ReactEventH,String) => _] = OptDefault,
TransitionComponent : OptionalParam[String | js.Function] = OptDefault,
anchorOrigin : OptionalParam[js.Object] = OptDefault,
open : OptionalParam[Boolean] = OptDefault,
onEnter : OptionalParam[js.Function] = OptDefault,
action : OptionalParam[ReactNode] = OptDefault,
onExited : OptionalParam[js.Function] = OptDefault,
resumeHideDuration : OptionalParam[Double | Int] = OptDefault,
message : OptionalParam[ReactNode] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onExiting : OptionalParam[js.Function] = OptDefault,
onClose : OptionalParam[js.Function] = OptDefault,
onExit : OptionalParam[js.Function] = OptDefault,
onEntered : OptionalParam[js.Function] = OptDefault,
onEntering : OptionalParam[js.Function] = OptDefault,
ContentProps : OptionalParam[js.Object] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiSnackbarComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiSnackbarComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiSnackbarComponent.type](
      MuiSnackbarComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiSnackbarC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiSnackbarComponent.type](
      MuiSnackbarComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         