
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
 @JSImport("@material-ui/core/Typography",JSImport.Default)
object MuiTypographyComponent extends JSComponent[js.Object] {

 }

 object MuiTypography {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
gutterBottom : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
headlineMapping : OptionalParam[js.Object] = OptDefault,
variant : OptionalParam[MuiTypographyVariant] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
align : OptionalParam[MuiTypographyAlign] = OptDefault,
color : OptionalParam[MuiTypographyColor] = OptDefault,
noWrap : OptionalParam[Boolean] = OptDefault,
paragraph : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiTypographyComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiTypographyComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiTypographyComponent.type](
      MuiTypographyComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiTypographyC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiTypographyComponent.type](
      MuiTypographyComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiTypographyAlign extends js.Object

 object MuiTypographyAlign {
   @inline def INHERIT = "inherit".asInstanceOf[MuiTypographyAlign] 
@inline def LEFT = "left".asInstanceOf[MuiTypographyAlign] 
@inline def CENTER = "center".asInstanceOf[MuiTypographyAlign] 
@inline def RIGHT = "right".asInstanceOf[MuiTypographyAlign] 
@inline def JUSTIFY = "justify".asInstanceOf[MuiTypographyAlign] 
 }

       

 @js.native
 trait MuiTypographyVariant extends js.Object

 object MuiTypographyVariant {
   @inline def DISPLAY4 = "display4".asInstanceOf[MuiTypographyVariant] 
@inline def DISPLAY3 = "display3".asInstanceOf[MuiTypographyVariant] 
@inline def DISPLAY2 = "display2".asInstanceOf[MuiTypographyVariant] 
@inline def DISPLAY1 = "display1".asInstanceOf[MuiTypographyVariant] 
@inline def HEADLINE = "headline".asInstanceOf[MuiTypographyVariant] 
@inline def TITLE = "title".asInstanceOf[MuiTypographyVariant] 
@inline def SUBHEADING = "subheading".asInstanceOf[MuiTypographyVariant] 
@inline def BODY2 = "body2".asInstanceOf[MuiTypographyVariant] 
@inline def BODY1 = "body1".asInstanceOf[MuiTypographyVariant] 
@inline def CAPTION = "caption".asInstanceOf[MuiTypographyVariant] 
@inline def BUTTON = "button".asInstanceOf[MuiTypographyVariant] 
 }

       

 @js.native
 trait MuiTypographyColor extends js.Object

 object MuiTypographyColor {
   @inline def INHERIT = "inherit".asInstanceOf[MuiTypographyColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiTypographyColor] 
@inline def TEXTSECONDARY = "textSecondary".asInstanceOf[MuiTypographyColor] 
@inline def SECONDARY = "secondary".asInstanceOf[MuiTypographyColor] 
@inline def ERROR = "error".asInstanceOf[MuiTypographyColor] 
@inline def DEFAULT = "default".asInstanceOf[MuiTypographyColor] 
 }

       


     

         