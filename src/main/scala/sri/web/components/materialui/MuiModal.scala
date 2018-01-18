
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
className : OptionalParam[String] = OptDefault,
ignoreBackdropClick : OptionalParam[Boolean] = OptDefault,
onBackdropClick : OptionalParam[js.Function] = OptDefault,
BackdropComponent : OptionalParam[String | js.Function] = OptDefault,
BackdropClassName : OptionalParam[String] = OptDefault,
onEnter : OptionalParam[js.Function] = OptDefault,
ignoreEscapeKeyUp : OptionalParam[Boolean] = OptDefault,
BackdropInvisible : OptionalParam[Boolean] = OptDefault,
show : OptionalParam[Boolean] = OptDefault,
disableBackdrop : OptionalParam[Boolean] = OptDefault,
onExited : OptionalParam[js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onExiting : OptionalParam[js.Function] = OptDefault,
BackdropTransitionDuration : OptionalParam[Double | Int | js.Object] = OptDefault,
onClose : OptionalParam[js.Function] = OptDefault,
onExit : OptionalParam[js.Function] = OptDefault,
onEscapeKeyUp : OptionalParam[js.Function] = OptDefault,
onEntered : OptionalParam[js.Function] = OptDefault,
onEntering : OptionalParam[js.Function] = OptDefault,
modalManager : OptionalParam[js.Object] = OptDefault,
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

 

 object MuiModalC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiModalComponent.type](
      MuiModalComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         