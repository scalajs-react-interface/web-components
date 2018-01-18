
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
 @JSImport("material-ui/transitions","Collapse")
object MuiCollapseComponent extends JSComponent[js.Object] {

 }

 object MuiCollapse {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
in : OptionalParam[Boolean] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
timeout : OptionalParam[String | Int | Double | js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
collapsedHeight : OptionalParam[String] = OptDefault,
containerProps : OptionalParam[js.Object] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiCollapseComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiCollapseComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiCollapseComponent.type](
      MuiCollapseComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiCollapseC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiCollapseComponent.type](
      MuiCollapseComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         