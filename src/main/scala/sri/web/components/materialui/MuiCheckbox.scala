
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
 @JSImport("@material-ui/core/Checkbox",JSImport.Default)
object MuiCheckboxComponent extends JSComponent[js.Object] {

 }

 object MuiCheckbox {

    @inline
    def apply(value : OptionalParam[String] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
icon : OptionalParam[ReactNode] = OptDefault,
onChange : OptionalParam[(ReactEventH,Boolean) => _] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
checked : OptionalParam[Boolean | String] = OptDefault,
disableRipple : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
inputProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
color : OptionalParam[MuiCheckboxColor] = OptDefault,
inputRef : OptionalParam[js.Function] = OptDefault,
checkedIcon : OptionalParam[ReactNode] = OptDefault,
`type` : OptionalParam[String] = OptDefault,
indeterminate : OptionalParam[Boolean] = OptDefault,
indeterminateIcon : OptionalParam[ReactNode] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiCheckboxComponent.type, Unit] = null): ReactElement { type Instance = MuiCheckboxComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiCheckboxComponent.type](
      MuiCheckboxComponent,
      props,
      key,
      ref)
    }
 }

 

         
 @js.native
 trait MuiCheckboxColor extends js.Object

 object MuiCheckboxColor {
   @inline def PRIMARY = "primary".asInstanceOf[MuiCheckboxColor] 
@inline def SECONDARY = "secondary".asInstanceOf[MuiCheckboxColor] 
@inline def DEFAULT = "default".asInstanceOf[MuiCheckboxColor] 
 }

       


     

         