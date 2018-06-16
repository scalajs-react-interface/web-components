
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
 @JSImport("@material-ui/core/NativeSelect",JSImport.Default)
object MuiNativeSelectComponent extends JSComponent[js.Object] {

 }

 object MuiNativeSelect {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
IconComponent : OptionalParam[String | js.Function] = OptDefault,
onChange : OptionalParam[js.Function] = OptDefault,
input : OptionalParam[ReactElement] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
inputProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
value : OptionalParam[String | Double | Int] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiNativeSelectComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiNativeSelectComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiNativeSelectComponent.type](
      MuiNativeSelectComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiNativeSelectC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiNativeSelectComponent.type](
      MuiNativeSelectComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         