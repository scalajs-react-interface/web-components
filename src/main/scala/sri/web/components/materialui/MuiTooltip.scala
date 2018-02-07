
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
 @JSImport("material-ui/Tooltip",JSImport.Default)
object MuiTooltipComponent extends JSComponent[js.Object] {

 }

 object MuiTooltip {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
placement : OptionalParam[MuiTooltipPlacement] = OptDefault,
className : OptionalParam[String] = OptDefault,
disableTriggerFocus : OptionalParam[Boolean] = OptDefault,
open : OptionalParam[Boolean] = OptDefault,
title : ReactNode,
enterDelay : OptionalParam[Double | Int] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onOpen : OptionalParam[js.Function] = OptDefault,
onClose : OptionalParam[js.Function] = OptDefault,
leaveDelay : OptionalParam[Double | Int] = OptDefault,
disableTriggerHover : OptionalParam[Boolean] = OptDefault,
PopperProps : OptionalParam[js.Object] = OptDefault,
disableTriggerTouch : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTooltipComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTooltipComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTooltipComponent.type](
      MuiTooltipComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

         
 @js.native
 trait MuiTooltipPlacement extends js.Object

 object MuiTooltipPlacement {
   @inline def BOTTOM_END = "bottom-end".asInstanceOf[MuiTooltipPlacement] 
@inline def BOTTOM_START = "bottom-start".asInstanceOf[MuiTooltipPlacement] 
@inline def BOTTOM = "bottom".asInstanceOf[MuiTooltipPlacement] 
@inline def LEFT_END = "left-end".asInstanceOf[MuiTooltipPlacement] 
@inline def LEFT_START = "left-start".asInstanceOf[MuiTooltipPlacement] 
@inline def LEFT = "left".asInstanceOf[MuiTooltipPlacement] 
@inline def RIGHT_END = "right-end".asInstanceOf[MuiTooltipPlacement] 
@inline def RIGHT_START = "right-start".asInstanceOf[MuiTooltipPlacement] 
@inline def RIGHT = "right".asInstanceOf[MuiTooltipPlacement] 
@inline def TOP_END = "top-end".asInstanceOf[MuiTooltipPlacement] 
@inline def TOP_START = "top-start".asInstanceOf[MuiTooltipPlacement] 
@inline def TOP = "top".asInstanceOf[MuiTooltipPlacement] 
 }

       


     

         