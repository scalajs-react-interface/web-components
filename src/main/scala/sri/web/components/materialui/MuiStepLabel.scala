
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
 @JSImport("material-ui/Stepper","StepLabel")
object MuiStepLabelComponent extends JSComponent[js.Object] {

 }

 object MuiStepLabel {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
icon : OptionalParam[ReactNode] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
optional : OptionalParam[ReactNode] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiStepLabelComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiStepLabelComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiStepLabelComponent.type](
      MuiStepLabelComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiStepLabelC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiStepLabelComponent.type](
      MuiStepLabelComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         