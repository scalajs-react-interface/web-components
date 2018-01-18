
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
 @JSImport("material-ui/Form","FormControlLabel")
object MuiFormControlLabelComponent extends JSComponent[js.Object] {

 }

 object MuiFormControlLabel {

    @inline
    def apply(value : OptionalParam[String] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
onChange : OptionalParam[js.Function] = OptDefault,
label : OptionalParam[ReactNode] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
checked : OptionalParam[Boolean | String] = OptDefault,
control : OptionalParam[ReactElement] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
name : OptionalParam[String] = OptDefault,
inputRef : OptionalParam[js.Function] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiFormControlLabelComponent.type, Unit] = null): ReactElement { type Instance = MuiFormControlLabelComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiFormControlLabelComponent.type](
      MuiFormControlLabelComponent,
      props,
      key,
      ref)
    }
 }

 

         


     

         