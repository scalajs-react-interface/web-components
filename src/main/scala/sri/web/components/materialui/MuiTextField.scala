
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
 @JSImport("@material-ui/core/TextField",JSImport.Default)
object MuiTextFieldComponent extends JSComponent[js.Object] {

 }

 object MuiTextField {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
fullWidth : OptionalParam[Boolean] = OptDefault,
FormHelperTextProps : OptionalParam[js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
InputLabelProps : OptionalParam[js.Object] = OptDefault,
autoFocus : OptionalParam[Boolean] = OptDefault,
autoComplete : OptionalParam[String] = OptDefault,
label : OptionalParam[ReactNode] = OptDefault,
rows : OptionalParam[String | Double | Int] = OptDefault,
helperText : OptionalParam[ReactNode] = OptDefault,
required : OptionalParam[Boolean] = OptDefault,
onChange : OptionalParam[(ReactEventI) => _] = OptDefault,
multiline : OptionalParam[Boolean] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
rowsMax : OptionalParam[String | Double | Int] = OptDefault,
select : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
SelectProps : OptionalParam[js.Object] = OptDefault,
inputProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
defaultValue : OptionalParam[String | Double | Int] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
InputProps : OptionalParam[js.Object] = OptDefault,
name : OptionalParam[String] = OptDefault,
placeholder : OptionalParam[String] = OptDefault,
value : OptionalParam[String | Int | Double | js.Array[Double] | js.Array[String]] = OptDefault,
inputRef : OptionalParam[js.Function] = OptDefault,
margin : OptionalParam[MuiTextFieldMargin] = OptDefault,
`type` : OptionalParam[String] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTextFieldComponent.type, Unit] = null): ReactElement { type Instance = MuiTextFieldComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTextFieldComponent.type](
      MuiTextFieldComponent,
      props,
      key,
      ref)
    }
 }

 

         
 @js.native
 trait MuiTextFieldMargin extends js.Object

 object MuiTextFieldMargin {
   @inline def NONE = "none".asInstanceOf[MuiTextFieldMargin] 
@inline def DENSE = "dense".asInstanceOf[MuiTextFieldMargin] 
@inline def NORMAL = "normal".asInstanceOf[MuiTextFieldMargin] 
 }

       


     

         