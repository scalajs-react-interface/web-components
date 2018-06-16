
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
 @JSImport("@material-ui/core/SwipeableDrawer",JSImport.Default)
object MuiSwipeableDrawerComponent extends JSComponent[js.Object] {

 }

 object MuiSwipeableDrawer {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
transitionDuration : OptionalParam[Double | Int | js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
onOpen : js.Function,
disableDiscovery : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
disableSwipeToOpen : OptionalParam[Boolean] = OptDefault,
swipeAreaWidth : OptionalParam[Double | Int] = OptDefault,
open : Boolean,
onClose : js.Function,
disableBackdropTransition : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiSwipeableDrawerComponent.type, Unit] = null): ReactElement { type Instance = MuiSwipeableDrawerComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiSwipeableDrawerComponent.type](
      MuiSwipeableDrawerComponent,
      props,
      key,
      ref)
    }
 }

 

         


     

         