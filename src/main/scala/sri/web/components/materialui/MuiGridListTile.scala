
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
 @JSImport("@material-ui/core/GridListTile",JSImport.Default)
object MuiGridListTileComponent extends JSComponent[js.Object] {

 }

 object MuiGridListTile {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
rows : OptionalParam[Double | Int] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
cols : OptionalParam[Double | Int] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiGridListTileComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiGridListTileComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiGridListTileComponent.type](
      MuiGridListTileComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiGridListTileC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiGridListTileComponent.type](
      MuiGridListTileComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         


     

         