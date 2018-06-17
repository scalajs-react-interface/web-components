package sri.web.components.victory

import scalajsplus.{OptDefault, OptionalParam}
import scalajsplus.macros.FunctionObjectMacro

import scala.scalajs.js
import scala.scalajs.js.{Array => A}
import scala.scalajs.js.|

object VictoryTypes {

  type StringOrNumberOrCallback =
    String | Double | Int | js.Function0[String | Double]

  type AnimationStyle = js.Dictionary[String | Double | Int]

  type AnimationData = AnimationStyle | js.Array[AnimationStyle]

  type CategoryPropType = js.Array[String] | VictoryCategory

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
