
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
 @JSImport("material-ui/ButtonBase",JSImport.Default)
object MuiButtonBaseComponent extends JSComponent[js.Object] {

 }

 object MuiButtonBase {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
onKeyboardFocus : OptionalParam[js.Function] = OptDefault,
focusRipple : OptionalParam[Boolean] = OptDefault,
disableRipple : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
centerRipple : OptionalParam[Boolean] = OptDefault,
keyboardFocusedClassName : OptionalParam[String] = OptDefault,
buttonRef : OptionalParam[js.Function] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiButtonBaseComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiButtonBaseComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiButtonBaseComponent.type](
      MuiButtonBaseComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiButtonBaseC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiButtonBaseComponent.type](
      MuiButtonBaseComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         