
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
 @JSImport("@material-ui/core/Zoom",JSImport.Default)
object MuiZoomComponent extends JSComponent[js.Object] {

 }

 object MuiZoom {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
timeout : OptionalParam[Double | Int | js.Object] = OptDefault,
in : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiZoomComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiZoomComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiZoomComponent.type](
      MuiZoomComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiZoomC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiZoomComponent.type](
      MuiZoomComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         