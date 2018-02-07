
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
 @JSImport("material-ui/Progress","CircularProgress")
object MuiCircularProgressComponent extends JSComponent[js.Object] {

 }

 object MuiCircularProgress {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
min : OptionalParam[Double | Int] = OptDefault,
className : OptionalParam[String] = OptDefault,
max : OptionalParam[Double | Int] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
thickness : OptionalParam[Double | Int] = OptDefault,
color : OptionalParam[MuiCircularProgressColor] = OptDefault,
variant : OptionalParam[MuiCircularProgressVariant] = OptDefault,
size : OptionalParam[Double | Int | String] = OptDefault,
value : OptionalParam[Double | Int] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiCircularProgressComponent.type, Unit] = null): ReactElement { type Instance = MuiCircularProgressComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiCircularProgressComponent.type](
      MuiCircularProgressComponent,
      props,
      key,
      ref)
    }
 }

 

         
 @js.native
 trait MuiCircularProgressVariant extends js.Object

 object MuiCircularProgressVariant {
   @inline def DETERMINATE = "determinate".asInstanceOf[MuiCircularProgressVariant] 
@inline def INDETERMINATE = "indeterminate".asInstanceOf[MuiCircularProgressVariant] 
 }

       

 @js.native
 trait MuiCircularProgressColor extends js.Object

 object MuiCircularProgressColor {
   @inline def PRIMARY = "primary".asInstanceOf[MuiCircularProgressColor] 
@inline def SECONDARY = "secondary".asInstanceOf[MuiCircularProgressColor] 
@inline def INHERIT = "inherit".asInstanceOf[MuiCircularProgressColor] 
 }

       


     

         