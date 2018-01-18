
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
 @JSImport("material-ui/Table","TablePagination")
object MuiTablePaginationComponent extends JSComponent[js.Object] {

 }

 object MuiTablePagination {

    @inline
    def apply(rowsPerPage : Double | Int,
id : OptionalParam[String] = OptDefault,
onChangePage : js.Function,
className : OptionalParam[String] = OptDefault,
onChangeRowsPerPage : OptionalParam[js.Function] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
count : Double | Int,
rowsPerPageOptions : OptionalParam[js.Array[Int]] = OptDefault,
page : Double | Int,
labelRowsPerPage : OptionalParam[ReactNode] = OptDefault,
labelDisplayedRows : OptionalParam[js.Function] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTablePaginationComponent.type, Unit] = null): ReactElement { type Instance = MuiTablePaginationComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTablePaginationComponent.type](
      MuiTablePaginationComponent,
      props,
      key,
      ref)
    }
 }

 

         


     

         