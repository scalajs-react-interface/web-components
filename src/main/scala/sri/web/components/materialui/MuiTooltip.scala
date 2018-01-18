
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
 @JSImport("material-ui/Tooltip",JSImport.Default)
object MuiTooltipComponent extends JSComponent[js.Object] {

 }

 object MuiTooltip {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTooltipComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTooltipComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTooltipComponent.type](
      MuiTooltipComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiTooltipC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTooltipComponent.type](
      MuiTooltipComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         