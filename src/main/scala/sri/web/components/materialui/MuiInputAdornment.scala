
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
 @JSImport("@material-ui/core/InputAdornment",JSImport.Default)
object MuiInputAdornmentComponent extends JSComponent[js.Object] {

 }

 object MuiInputAdornment {

    @inline
    def apply(position : OptionalParam[MuiInputAdornmentPosition] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
disableTypography : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiInputAdornmentComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiInputAdornmentComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiInputAdornmentComponent.type](
      MuiInputAdornmentComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiInputAdornmentC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiInputAdornmentComponent.type](
      MuiInputAdornmentComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiInputAdornmentPosition extends js.Object

 object MuiInputAdornmentPosition {
   @inline def START = "start".asInstanceOf[MuiInputAdornmentPosition] 
@inline def END = "end".asInstanceOf[MuiInputAdornmentPosition] 
 }

       


     

         