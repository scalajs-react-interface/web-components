
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
 @JSImport("material-ui/Form","FormControl")
object MuiFormControlComponent extends JSComponent[js.Object] {

 }

 object MuiFormControl {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
fullWidth : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
required : OptionalParam[Boolean] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
margin : OptionalParam[MuiFormControlMargin] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiFormControlComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiFormControlComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiFormControlComponent.type](
      MuiFormControlComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiFormControlC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiFormControlComponent.type](
      MuiFormControlComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiFormControlMargin extends js.Object

 object MuiFormControlMargin {
   @inline def NONE = "none".asInstanceOf[MuiFormControlMargin] 
@inline def DENSE = "dense".asInstanceOf[MuiFormControlMargin] 
@inline def NORMAL = "normal".asInstanceOf[MuiFormControlMargin] 
 }

       


     

         