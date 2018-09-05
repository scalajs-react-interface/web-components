package sri.web.components.victory

import scalajsplus.{OptDefault, OptionalParam}
import scalajsplus.macros.FunctionObjectMacro
import sri.web.components.victory.VictoryTypes.AnimationStyle

import scala.scalajs.js
import scala.scalajs.js.{Array => A}
import scala.scalajs.js.|

object VictoryTypes {

  type StringOrNumberOrCallback =
    String | Double | Int | js.Function0[String | Double]

  type AnimationStyle = js.Dictionary[String | Double | Int]

  type AnimationData = AnimationStyle | js.Array[AnimationStyle]

  type CategoryPropType = js.Array[String] | VictoryCategory

  type DataGetterPropType =
    String | Int | Double | js.Array[String] | js.Function

  type DomainPaddingPropType =
    Int | Double | A[Int] | js.Tuple2[Int, Int] | js.Tuple2[Double, Double] | DomainPaddingObject

  type ColorScaleProp = ColorScale | js.Array[String]

}

trait DomainPaddingObject extends js.Object

object DomainPaddingObject {

  @inline def apply(
      x: OptionalParam[js.Tuple2[Int, Int] | js.Tuple2[Double, Double]] =
        OptDefault,
      y: OptionalParam[js.Tuple2[Int, Int] | js.Tuple2[Double, Double]] =
        OptDefault): DomainPaddingObject = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[DomainPaddingObject]
  }
}

sealed trait VictoryCategory extends js.Object

object VictoryCategory {

  @inline
  def apply(x: A[String], y: A[String]): VictoryCategory = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryCategory]
  }
}

trait VictoryThemeDefinition extends js.Object

object VictoryThemeDefinition {

  @inline def apply(
      area: OptionalParam[VictoryStyle] = OptDefault,
      axis: OptionalParam[VictoryThemeAxis] = OptDefault,
      bar: OptionalParam[VictoryStyle] = OptDefault,
      candlestick: OptionalParam[VictoryThemeCandlestick] = OptDefault,
      line: OptionalParam[VictoryStyle] = OptDefault,
      pie: OptionalParam[VictoryThemePie] = OptDefault,
      scatter: OptionalParam[VictoryStyle] = OptDefault,
      props: OptionalParam[VictoryThemePieProps] = OptDefault
  ): VictoryThemeDefinition = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryThemeDefinition]
  }
}

trait VictoryThemePie extends js.Object

object VictoryThemePie {

  @inline def apply(props: VictoryThemePieProps,
                    style: VictoryStyle): VictoryThemePie = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryThemePie]
  }
}

trait VictoryThemePieProps extends js.Object

object VictoryThemePieProps {

  @inline def apply(width: Double,
                    height: Double,
                    colorScale: A[String]): VictoryThemePieProps = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryThemePieProps]
  }
}

trait VictoryStyle extends js.Object

object VictoryStyle {

  @inline def apply(
      parent: OptionalParam[js.Object] = OptDefault,
      data: OptionalParam[js.Object] = OptDefault,
      labels: OptionalParam[js.Object] = OptDefault,
      axisLabel: OptionalParam[js.Object] = OptDefault,
      axis: OptionalParam[js.Object] = OptDefault,
      grid: OptionalParam[js.Object] = OptDefault,
      ticks: OptionalParam[js.Object] = OptDefault,
      tickLabels: OptionalParam[js.Object] = OptDefault
  ): VictoryStyle = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryStyle]
  }
}

trait VictoryThemeCandlestick extends js.Object

object VictoryThemeCandlestick {

  @inline def apply(
      parent: OptionalParam[js.Object] = OptDefault,
      data: OptionalParam[js.Object] = OptDefault,
      labels: OptionalParam[js.Object] = OptDefault,
      tickLabels: OptionalParam[js.Object] = OptDefault,
      props: OptionalParam[VictoryThemeCandlestickProps] = OptDefault
  ): VictoryThemeCandlestick = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryThemeCandlestick]
  }
}

trait VictoryThemeCandlestickProps extends js.Object

object VictoryThemeCandlestickProps {

  @inline def apply(
      width: Double | Int,
      height: Double | Int,
      candleColors: VictoryThemeCandlestickPropsCandleColors
  ): VictoryThemeCandlestickProps = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryThemeCandlestickProps]
  }
}

trait VictoryThemeCandlestickPropsCandleColors extends js.Object

object VictoryThemeCandlestickPropsCandleColors {

  @inline def apply(
      positive: String,
      negative: String): VictoryThemeCandlestickPropsCandleColors = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryThemeCandlestickPropsCandleColors]
  }
}

trait VictoryThemeAxis extends js.Object

object VictoryThemeAxis {

  @inline def apply(axis: String,
                    axisLabel: String,
                    grid: String,
                    ticks: String,
                    tickLabels: String): VictoryThemeAxis = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryThemeAxis]
  }
}

trait ColorScale extends js.Object

object ColorScale {

  @inline def WARM = "warm".asInstanceOf[ColorScale]
  @inline def GRAYSCALE = "grayscale".asInstanceOf[ColorScale]
  @inline def QUALITATIVE = "qualitative".asInstanceOf[ColorScale]
  @inline def HEATMAP = "heatmap".asInstanceOf[ColorScale]
  @inline def COOL = "cool".asInstanceOf[ColorScale]
  @inline def RED = "red".asInstanceOf[ColorScale]
  @inline def GREEN = "green".asInstanceOf[ColorScale]
  @inline def BLUE = "blue".asInstanceOf[ColorScale]
}

trait AnimateProp extends js.Object

object AnimateProp {

  @inline def apply(duration: OptionalParam[Double | Int] = OptDefault,
                    onEnd: OptionalParam[() => _] = OptDefault,
                    onExit: OptionalParam[AnimateOnExit] = OptDefault,
                    easing: OptionalParam[AnimationEasing] = OptDefault,
                    onEnter: OptionalParam[AnimateOnEnter] = OptDefault,
                    onLoad: OptionalParam[AnimateOnLoad] = OptDefault,
  ): AnimateProp = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[AnimateProp]
  }
}

trait AnimateOnExit extends js.Object

object AnimateOnExit {

  @inline def apply[D](duration: OptionalParam[Double | Int] = OptDefault,
                       before: OptionalParam[D => AnimationStyle] = OptDefault)
    : AnimateOnExit = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[AnimateOnExit]
  }
}

trait AnimateOnEnter extends js.Object

object AnimateOnEnter {

  @inline def apply[D](duration: OptionalParam[Double | Int] = OptDefault,
                       before: OptionalParam[D => AnimationStyle] = OptDefault,
                       after: OptionalParam[D => AnimationStyle] = OptDefault)
    : AnimateOnEnter = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[AnimateOnEnter]
  }
}

trait AnimateOnLoad extends js.Object

object AnimateOnLoad {

  @inline def apply[D](
      duration: OptionalParam[Double | Int] = OptDefault,
      before: OptionalParam[D => AnimationStyle] = OptDefault,
      after: OptionalParam[D => AnimationStyle] = OptDefault): AnimateOnLoad = {
    import scalajsplus.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    p.asInstanceOf[AnimateOnLoad]
  }
}

trait VictoryPadding extends js.Object

object VictoryPadding {

  @inline def apply(
      top: OptionalParam[Double | Int] = OptDefault,
      bottom: OptionalParam[Double | Int] = OptDefault,
      left: OptionalParam[Double | Int] = OptDefault,
      right: OptionalParam[Double | Int] = OptDefault
  ): VictoryPadding = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryPadding]
  }
}

trait VictoryDomain extends js.Object

object VictoryDomain {

  @inline def apply(
      x: OptionalParam[js.Array[Int] | js.Array[Float]] = OptDefault,
      y: OptionalParam[js.Array[Int] | js.Array[Float]] = OptDefault
  ): VictoryDomain = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[VictoryDomain]
  }
}
