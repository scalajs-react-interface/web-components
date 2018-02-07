
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
 @JSImport("material-ui/Table","TableCell")
object MuiTableCellComponent extends JSComponent[js.Object] {

 }

 object MuiTableCell {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
numeric : OptionalParam[Boolean] = OptDefault,
padding : OptionalParam[MuiTableCellPadding] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
sortDirection : OptionalParam[MuiTableCellSortDirection] = OptDefault,
variant : OptionalParam[MuiTableCellVariant] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTableCellComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTableCellComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTableCellComponent.type](
      MuiTableCellComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiTableCellC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTableCellComponent.type](
      MuiTableCellComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiTableCellSortDirection extends js.Object

 object MuiTableCellSortDirection {
   @inline def ASC = "asc".asInstanceOf[MuiTableCellSortDirection] 
@inline def DESC = "desc".asInstanceOf[MuiTableCellSortDirection] 
@inline def FALSE = "false".asInstanceOf[MuiTableCellSortDirection] 
 }

       

 @js.native
 trait MuiTableCellVariant extends js.Object

 object MuiTableCellVariant {
   @inline def HEAD = "head".asInstanceOf[MuiTableCellVariant] 
@inline def BODY = "body".asInstanceOf[MuiTableCellVariant] 
@inline def FOOTER = "footer".asInstanceOf[MuiTableCellVariant] 
 }

       

 @js.native
 trait MuiTableCellPadding extends js.Object

 object MuiTableCellPadding {
   @inline def DEFAULT = "default".asInstanceOf[MuiTableCellPadding] 
@inline def CHECKBOX = "checkbox".asInstanceOf[MuiTableCellPadding] 
@inline def DENSE = "dense".asInstanceOf[MuiTableCellPadding] 
@inline def NONE = "none".asInstanceOf[MuiTableCellPadding] 
 }

       


     

         