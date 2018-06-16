
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
 @JSImport("@material-ui/core/GridListTileBar",JSImport.Default)
object MuiGridListTileBarComponent extends JSComponent[js.Object] {

 }

 object MuiGridListTileBar {

    @inline
    def apply(title : OptionalParam[ReactNode] = OptDefault,
id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
actionIcon : OptionalParam[ReactNode] = OptDefault,
actionPosition : OptionalParam[MuiGridListTileBarActionPosition] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
titlePosition : OptionalParam[MuiGridListTileBarTitlePosition] = OptDefault,
subtitle : OptionalParam[ReactNode] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiGridListTileBarComponent.type, Unit] = null): ReactElement { type Instance = MuiGridListTileBarComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiGridListTileBarComponent.type](
      MuiGridListTileBarComponent,
      props,
      key,
      ref)
    }
 }

 

         
 @js.native
 trait MuiGridListTileBarTitlePosition extends js.Object

 object MuiGridListTileBarTitlePosition {
   @inline def TOP = "top".asInstanceOf[MuiGridListTileBarTitlePosition] 
@inline def BOTTOM = "bottom".asInstanceOf[MuiGridListTileBarTitlePosition] 
 }

       

 @js.native
 trait MuiGridListTileBarActionPosition extends js.Object

 object MuiGridListTileBarActionPosition {
   @inline def LEFT = "left".asInstanceOf[MuiGridListTileBarActionPosition] 
@inline def RIGHT = "right".asInstanceOf[MuiGridListTileBarActionPosition] 
 }

       


     

         