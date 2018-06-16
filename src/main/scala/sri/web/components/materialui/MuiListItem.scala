
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
 @JSImport("@material-ui/core/ListItem",JSImport.Default)
object MuiListItemComponent extends JSComponent[js.Object] {

 }

 object MuiListItem {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
ContainerProps : OptionalParam[js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
dense : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
divider : OptionalParam[Boolean] = OptDefault,
ContainerComponent : OptionalParam[String | js.Function] = OptDefault,
disableGutters : OptionalParam[Boolean] = OptDefault,
button : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiListItemComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiListItemComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiListItemComponent.type](
      MuiListItemComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiListItemC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiListItemComponent.type](
      MuiListItemComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         