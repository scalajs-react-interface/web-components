
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
 @JSImport("@material-ui/core/MobileStepper",JSImport.Default)
object MuiMobileStepperComponent extends JSComponent[js.Object] {

 }

 object MuiMobileStepper {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
steps : Double | Int,
className : OptionalParam[String] = OptDefault,
position : OptionalParam[MuiMobileStepperPosition] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
activeStep : OptionalParam[Double | Int] = OptDefault,
nextButton : OptionalParam[ReactNode] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
variant : OptionalParam[MuiMobileStepperVariant] = OptDefault,
backButton : OptionalParam[ReactNode] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiMobileStepperComponent.type, Unit] = null): ReactElement { type Instance = MuiMobileStepperComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiMobileStepperComponent.type](
      MuiMobileStepperComponent,
      props,
      key,
      ref)
    }
 }

 

         
 @js.native
 trait MuiMobileStepperPosition extends js.Object

 object MuiMobileStepperPosition {
   @inline def BOTTOM = "bottom".asInstanceOf[MuiMobileStepperPosition] 
@inline def TOP = "top".asInstanceOf[MuiMobileStepperPosition] 
@inline def STATIC = "static".asInstanceOf[MuiMobileStepperPosition] 
 }

       

 @js.native
 trait MuiMobileStepperVariant extends js.Object

 object MuiMobileStepperVariant {
   @inline def TEXT = "text".asInstanceOf[MuiMobileStepperVariant] 
@inline def DOTS = "dots".asInstanceOf[MuiMobileStepperVariant] 
@inline def PROGRESS = "progress".asInstanceOf[MuiMobileStepperVariant] 
 }

       


     

         