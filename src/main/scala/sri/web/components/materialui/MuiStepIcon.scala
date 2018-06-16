
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
 @JSImport("@material-ui/core/StepIcon",JSImport.Default)
object MuiStepIconComponent extends JSComponent[js.Object] {

 }

 object MuiStepIcon {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
active : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
icon : ReactNode,
style : OptionalParam[js.Any] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
completed : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiStepIconComponent.type, Unit] = null): ReactElement { type Instance = MuiStepIconComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiStepIconComponent.type](
      MuiStepIconComponent,
      props,
      key,
      ref)
    }
 }

 

         


     

         