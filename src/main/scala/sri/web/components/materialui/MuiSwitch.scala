
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
 @JSImport("@material-ui/core/Switch",JSImport.Default)
object MuiSwitchComponent extends JSComponent[js.Object] {

 }

 object MuiSwitch {

    @inline
    def apply(value : OptionalParam[String] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onChange : OptionalParam[js.Function] = OptDefault,
icon : OptionalParam[ReactNode] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
checked : OptionalParam[Boolean | String] = OptDefault,
disableRipple : OptionalParam[Boolean] = OptDefault,
color : OptionalParam[MuiSwitchColor] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
inputProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
inputRef : OptionalParam[js.Function] = OptDefault,
checkedIcon : OptionalParam[ReactNode] = OptDefault,
`type` : OptionalParam[String] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiSwitchComponent.type, Unit] = null): ReactElement { type Instance = MuiSwitchComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiSwitchComponent.type](
      MuiSwitchComponent,
      props,
      key,
      ref)
    }
 }

 

         
 @js.native
 trait MuiSwitchColor extends js.Object

 object MuiSwitchColor {
   @inline def PRIMARY = "primary".asInstanceOf[MuiSwitchColor] 
@inline def SECONDARY = "secondary".asInstanceOf[MuiSwitchColor] 
@inline def DEFAULT = "default".asInstanceOf[MuiSwitchColor] 
 }

       


     

         