
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
 @JSImport("@material-ui/core/CardHeader",JSImport.Default)
object MuiCardHeaderComponent extends JSComponent[js.Object] {

 }

 object MuiCardHeader {

    @inline
    def apply(title : OptionalParam[ReactNode] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
subheader : OptionalParam[ReactNode] = OptDefault,
avatar : OptionalParam[ReactNode] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
action : OptionalParam[ReactNode] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiCardHeaderComponent.type, Unit] = null): ReactElement { type Instance = MuiCardHeaderComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiCardHeaderComponent.type](
      MuiCardHeaderComponent,
      props,
      key,
      ref)
    }
 }

 

         


     

         