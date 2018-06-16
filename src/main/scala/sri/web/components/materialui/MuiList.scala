
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
 @JSImport("@material-ui/core/List",JSImport.Default)
object MuiListComponent extends JSComponent[js.Object] {

 }

 object MuiList {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
disablePadding : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
subheader : OptionalParam[ReactNode] = OptDefault,
rootRef : OptionalParam[dom.Element => _] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
dense : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiListComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiListComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiListComponent.type](
      MuiListComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiListC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiListComponent.type](
      MuiListComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         