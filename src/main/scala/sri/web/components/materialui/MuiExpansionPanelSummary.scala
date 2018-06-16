
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
 @JSImport("@material-ui/core/ExpansionPanelSummary",JSImport.Default)
object MuiExpansionPanelSummaryComponent extends JSComponent[js.Object] {

 }

 object MuiExpansionPanelSummary {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
expandIcon : OptionalParam[ReactNode] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiExpansionPanelSummaryComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiExpansionPanelSummaryComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiExpansionPanelSummaryComponent.type](
      MuiExpansionPanelSummaryComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiExpansionPanelSummaryC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiExpansionPanelSummaryComponent.type](
      MuiExpansionPanelSummaryComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         