
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
 @JSImport("@material-ui/core/Button",JSImport.Default)
object MuiButtonComponent extends JSComponent[js.Object] {

 }

 object MuiButton {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
fullWidth : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
href : OptionalParam[String] = OptDefault,
disableFocusRipple : OptionalParam[Boolean] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
mini : OptionalParam[Boolean] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
color : OptionalParam[MuiButtonColor] = OptDefault,
variant : OptionalParam[MuiButtonVariant] = OptDefault,
disableRipple : OptionalParam[Boolean] = OptDefault,
size : OptionalParam[MuiButtonSize] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiButtonComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiButtonComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiButtonComponent.type](
      MuiButtonComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiButtonC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiButtonComponent.type](
      MuiButtonComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiButtonColor extends js.Object

 object MuiButtonColor {
   @inline def DEFAULT = "default".asInstanceOf[MuiButtonColor] 
@inline def INHERIT = "inherit".asInstanceOf[MuiButtonColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiButtonColor] 
@inline def SECONDARY = "secondary".asInstanceOf[MuiButtonColor] 
 }

       

 @js.native
 trait MuiButtonVariant extends js.Object

 object MuiButtonVariant {
   @inline def FLAT = "flat".asInstanceOf[MuiButtonVariant] 
@inline def OUTLINED = "outlined".asInstanceOf[MuiButtonVariant] 
@inline def RAISED = "raised".asInstanceOf[MuiButtonVariant] 
@inline def FAB = "fab".asInstanceOf[MuiButtonVariant] 
 }

       

 @js.native
 trait MuiButtonSize extends js.Object

 object MuiButtonSize {
   @inline def SMALL = "small".asInstanceOf[MuiButtonSize] 
@inline def MEDIUM = "medium".asInstanceOf[MuiButtonSize] 
@inline def LARGE = "large".asInstanceOf[MuiButtonSize] 
 }

       


     

         