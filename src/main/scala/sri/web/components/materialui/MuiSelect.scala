
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
 @JSImport("material-ui/Select",JSImport.Default)
object MuiSelectComponent extends JSComponent[js.Object] {

 }

 object MuiSelect {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
multiple : OptionalParam[Boolean] = OptDefault,
input : OptionalParam[ReactElement] = OptDefault,
MenuProps : OptionalParam[js.Object] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
native : OptionalParam[Boolean] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
renderValue : OptionalParam[js.Function] = OptDefault,
value : OptionalParam[String | Int | Double | js.Array[Double] | js.Array[String]] = OptDefault,
autoWidth : OptionalParam[Boolean] = OptDefault,
displayEmpty : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiSelectComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiSelectComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiSelectComponent.type](
      MuiSelectComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiSelectC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiSelectComponent.type](
      MuiSelectComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         