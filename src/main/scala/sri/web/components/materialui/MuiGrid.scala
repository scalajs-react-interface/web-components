
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
 @JSImport("material-ui/Grid",JSImport.Default)
object MuiGridComponent extends JSComponent[js.Object] {

 }

 object MuiGrid {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
hidden : OptionalParam[js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
spacing : OptionalParam[MuiGridSpacing] = OptDefault,
direction : OptionalParam[MuiGridDirection] = OptDefault,
alignContent : OptionalParam[MuiGridAlignContent] = OptDefault,
sm : OptionalParam[Boolean | Int] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
item : OptionalParam[Boolean] = OptDefault,
md : OptionalParam[Boolean | Int] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
lg : OptionalParam[Boolean | Int] = OptDefault,
container : OptionalParam[Boolean] = OptDefault,
justify : OptionalParam[MuiGridJustify] = OptDefault,
xl : OptionalParam[Boolean | Int] = OptDefault,
wrap : OptionalParam[MuiGridWrap] = OptDefault,
gutter : OptionalParam[Boolean | Int] = OptDefault,
alignItems : OptionalParam[MuiGridAlignItems] = OptDefault,
xs : OptionalParam[Boolean | Int] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiGridComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiGridComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiGridComponent.type](
      MuiGridComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiGridC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiGridComponent.type](
      MuiGridComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiGridWrap extends js.Object

 object MuiGridWrap {
   @inline def NOWRAP = "nowrap".asInstanceOf[MuiGridWrap] 
@inline def WRAP = "wrap".asInstanceOf[MuiGridWrap] 
@inline def WRAP_REVERSE = "wrap-reverse".asInstanceOf[MuiGridWrap] 
 }

       

 @js.native
 trait MuiGridAlignContent extends js.Object

 object MuiGridAlignContent {
   @inline def STRETCH = "stretch".asInstanceOf[MuiGridAlignContent] 
@inline def CENTER = "center".asInstanceOf[MuiGridAlignContent] 
@inline def FLEX_START = "flex-start".asInstanceOf[MuiGridAlignContent] 
@inline def FLEX_END = "flex-end".asInstanceOf[MuiGridAlignContent] 
@inline def SPACE_BETWEEN = "space-between".asInstanceOf[MuiGridAlignContent] 
@inline def SPACE_AROUND = "space-around".asInstanceOf[MuiGridAlignContent] 
 }

       

 @js.native
 trait MuiGridJustify extends js.Object

 object MuiGridJustify {
   @inline def FLEX_START = "flex-start".asInstanceOf[MuiGridJustify] 
@inline def CENTER = "center".asInstanceOf[MuiGridJustify] 
@inline def FLEX_END = "flex-end".asInstanceOf[MuiGridJustify] 
@inline def SPACE_BETWEEN = "space-between".asInstanceOf[MuiGridJustify] 
@inline def SPACE_AROUND = "space-around".asInstanceOf[MuiGridJustify] 
 }

       

 @js.native
 trait MuiGridSpacing extends js.Object

 object MuiGridSpacing {
   @inline def _0 = 0.asInstanceOf[MuiGridSpacing] 
@inline def _8 = 8.asInstanceOf[MuiGridSpacing] 
@inline def _16 = 16.asInstanceOf[MuiGridSpacing] 
@inline def _24 = 24.asInstanceOf[MuiGridSpacing] 
@inline def _40 = 40.asInstanceOf[MuiGridSpacing] 
 }

       

 @js.native
 trait MuiGridDirection extends js.Object

 object MuiGridDirection {
   @inline def ROW = "row".asInstanceOf[MuiGridDirection] 
@inline def ROW_REVERSE = "row-reverse".asInstanceOf[MuiGridDirection] 
@inline def COLUMN = "column".asInstanceOf[MuiGridDirection] 
@inline def COLUMN_REVERSE = "column-reverse".asInstanceOf[MuiGridDirection] 
 }

       

 @js.native
 trait MuiGridAlignItems extends js.Object

 object MuiGridAlignItems {
   @inline def FLEX_START = "flex-start".asInstanceOf[MuiGridAlignItems] 
@inline def CENTER = "center".asInstanceOf[MuiGridAlignItems] 
@inline def FLEX_END = "flex-end".asInstanceOf[MuiGridAlignItems] 
@inline def STRETCH = "stretch".asInstanceOf[MuiGridAlignItems] 
@inline def BASELINE = "baseline".asInstanceOf[MuiGridAlignItems] 
 }

       


     

         