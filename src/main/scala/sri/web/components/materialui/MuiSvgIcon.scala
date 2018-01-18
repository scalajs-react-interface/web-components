
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
 @JSImport("material-ui/SvgIcon",JSImport.Default)
object MuiSvgIconComponent extends JSComponent[js.Object] {

 }

 object MuiSvgIcon {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
viewBox : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
titleAccess : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
color : OptionalParam[MuiSvgIconColor] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiSvgIconComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiSvgIconComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiSvgIconComponent.type](
      MuiSvgIconComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiSvgIconC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiSvgIconComponent.type](
      MuiSvgIconComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiSvgIconColor extends js.Object

 object MuiSvgIconColor {
   @inline def INHERIT = "inherit".asInstanceOf[MuiSvgIconColor] 
@inline def ACCENT = "accent".asInstanceOf[MuiSvgIconColor] 
@inline def ACTION = "action".asInstanceOf[MuiSvgIconColor] 
@inline def CONTRAST = "contrast".asInstanceOf[MuiSvgIconColor] 
@inline def DISABLED = "disabled".asInstanceOf[MuiSvgIconColor] 
@inline def ERROR = "error".asInstanceOf[MuiSvgIconColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiSvgIconColor] 
 }

       


     

         