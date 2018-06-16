
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
 @JSImport("@material-ui/core/Popover",JSImport.Default)
object MuiPopoverComponent extends JSComponent[js.Object] {

 }

 object MuiPopover {

    @inline
    def apply(marginThreshold : OptionalParam[Double | Int] = OptDefault,
id : OptionalParam[String] = OptDefault,
action : OptionalParam[js.Function] = OptDefault,
className : OptionalParam[String] = OptDefault,
transitionDuration : OptionalParam[String | Int | Double | js.Object] = OptDefault,
TransitionProps : OptionalParam[js.Object] = OptDefault,
TransitionComponent : OptionalParam[String | js.Function] = OptDefault,
anchorOrigin : OptionalParam[js.Object] = OptDefault,
onEnter : OptionalParam[js.Function] = OptDefault,
PaperProps : OptionalParam[js.Object] = OptDefault,
onExited : OptionalParam[js.Function] = OptDefault,
elevation : OptionalParam[Double | Int] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
anchorEl : OptionalParam[js.Object | js.Function] = OptDefault,
anchorReference : OptionalParam[MuiPopoverAnchorReference] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onExiting : OptionalParam[js.Function] = OptDefault,
onClose : OptionalParam[js.Function] = OptDefault,
onExit : OptionalParam[js.Function] = OptDefault,
container : OptionalParam[js.Object | js.Function] = OptDefault,
onEntered : OptionalParam[js.Function] = OptDefault,
open : Boolean,
onEntering : OptionalParam[js.Function] = OptDefault,
transformOrigin : OptionalParam[js.Object] = OptDefault,
getContentAnchorEl : OptionalParam[js.Function] = OptDefault,
anchorPosition : OptionalParam[js.Object] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiPopoverComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiPopoverComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiPopoverComponent.type](
      MuiPopoverComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

         
 @js.native
 trait MuiPopoverAnchorReference extends js.Object

 object MuiPopoverAnchorReference {
   @inline def ANCHOREL = "anchorEl".asInstanceOf[MuiPopoverAnchorReference] 
@inline def ANCHORPOSITION = "anchorPosition".asInstanceOf[MuiPopoverAnchorReference] 
@inline def NONE = "none".asInstanceOf[MuiPopoverAnchorReference] 
 }

       


     

         