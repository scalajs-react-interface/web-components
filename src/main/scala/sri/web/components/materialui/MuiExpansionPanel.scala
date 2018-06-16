
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
 @JSImport("@material-ui/core/ExpansionPanel",JSImport.Default)
object MuiExpansionPanelComponent extends JSComponent[js.Object] {

 }

 object MuiExpansionPanel {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
expanded : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
onChange : OptionalParam[js.Function] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
defaultExpanded : OptionalParam[Boolean] = OptDefault,
CollapseProps : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiExpansionPanelComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiExpansionPanelComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiExpansionPanelComponent.type](
      MuiExpansionPanelComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiExpansionPanelC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiExpansionPanelComponent.type](
      MuiExpansionPanelComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         