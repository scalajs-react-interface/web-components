
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
 @JSImport("@material-ui/core/Stepper",JSImport.Default)
object MuiStepperComponent extends JSComponent[js.Object] {

 }

 object MuiStepper {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
connector : OptionalParam[ReactElement] = OptDefault,
alternativeLabel : OptionalParam[Boolean] = OptDefault,
nonLinear : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
activeStep : OptionalParam[Double | Int] = OptDefault,
orientation : OptionalParam[MuiStepperOrientation] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiStepperComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiStepperComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiStepperComponent.type](
      MuiStepperComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiStepperC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiStepperComponent.type](
      MuiStepperComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiStepperOrientation extends js.Object

 object MuiStepperOrientation {
   @inline def HORIZONTAL = "horizontal".asInstanceOf[MuiStepperOrientation] 
@inline def VERTICAL = "vertical".asInstanceOf[MuiStepperOrientation] 
 }

       


     

         