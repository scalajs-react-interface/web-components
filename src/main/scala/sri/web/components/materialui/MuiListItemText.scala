
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
 @JSImport("@material-ui/core/ListItemText",JSImport.Default)
object MuiListItemTextComponent extends JSComponent[js.Object] {

 }

 object MuiListItemText {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
secondary : OptionalParam[ReactNode] = OptDefault,
inset : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
disableTypography : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
primary : OptionalParam[ReactNode] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiListItemTextComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiListItemTextComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiListItemTextComponent.type](
      MuiListItemTextComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiListItemTextC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiListItemTextComponent.type](
      MuiListItemTextComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         