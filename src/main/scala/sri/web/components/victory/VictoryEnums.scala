package sri.web.components.victory

import scala.scalajs.js;

sealed trait AnimationEasing extends js.Object

object AnimationEasing {

  @inline def BACK = "back".asInstanceOf[AnimationEasing]
  @inline def BACKIN = "backIn".asInstanceOf[AnimationEasing]
  @inline def BACKOUT = "backOut".asInstanceOf[AnimationEasing]
  @inline def BACKINOUT = "backInOut".asInstanceOf[AnimationEasing]
  @inline def BOUNCE = "bounce".asInstanceOf[AnimationEasing]
  @inline def BOUNCEIN = "bounceIn".asInstanceOf[AnimationEasing]
  @inline def BOUNCEOUT = "bounceOut".asInstanceOf[AnimationEasing]
  @inline def BOUNCEINOUT = "bounceInOut".asInstanceOf[AnimationEasing]
  @inline def CIRCLE = "circle".asInstanceOf[AnimationEasing]
  @inline def CIRCLEIN = "circleIn".asInstanceOf[AnimationEasing]
  @inline def CIRCLEOUT = "circleOut".asInstanceOf[AnimationEasing]
  @inline def CIRCLEINOUT = "circleInOut".asInstanceOf[AnimationEasing]
  @inline def LINEAR = "linear".asInstanceOf[AnimationEasing]
  @inline def LINEARIN = "linearIn".asInstanceOf[AnimationEasing]
  @inline def LINEAROUT = "linearOut".asInstanceOf[AnimationEasing]
  @inline def LINEARINOUT = "linearInOut".asInstanceOf[AnimationEasing]
  @inline def CUBIC = "cubic".asInstanceOf[AnimationEasing]
  @inline def CUBICIN = "cubicIn".asInstanceOf[AnimationEasing]
  @inline def CUBICOUT = "cubicOut".asInstanceOf[AnimationEasing]
  @inline def CUBICINOUT = "cubicInOut".asInstanceOf[AnimationEasing]
  @inline def ELASTIC = "elastic".asInstanceOf[AnimationEasing]
  @inline def ELASTICIN = "elasticIn".asInstanceOf[AnimationEasing]
  @inline def ELASTICOUT = "elasticOut".asInstanceOf[AnimationEasing]
  @inline def ELASTICINOUT = "elasticInOut".asInstanceOf[AnimationEasing]
  @inline def EXP = "exp".asInstanceOf[AnimationEasing]
  @inline def EXPIN = "expIn".asInstanceOf[AnimationEasing]
  @inline def EXPOUT = "expOut".asInstanceOf[AnimationEasing]
  @inline def EXPINOUT = "expInOut".asInstanceOf[AnimationEasing]
  @inline def POLY = "poly".asInstanceOf[AnimationEasing]
  @inline def POLYIN = "polyIn".asInstanceOf[AnimationEasing]
  @inline def POLYOUT = "polyOut".asInstanceOf[AnimationEasing]
  @inline def POLYINOUT = "polyInOut".asInstanceOf[AnimationEasing]
  @inline def QUAD = "quad".asInstanceOf[AnimationEasing]
  @inline def QUADIN = "quadIn".asInstanceOf[AnimationEasing]
  @inline def QUADOUT = "quadOut".asInstanceOf[AnimationEasing]
  @inline def QUADINOUT = "quadInOut".asInstanceOf[AnimationEasing]
  @inline def SIN = "sin".asInstanceOf[AnimationEasing]
  @inline def SININ = "sinIn".asInstanceOf[AnimationEasing]
  @inline def SINOUT = "sinOut".asInstanceOf[AnimationEasing]
  @inline def SININOUT = "sinInOut".asInstanceOf[AnimationEasing]

}

sealed trait TextAnchorType extends js.Object

object TextAnchorType {

  @inline def START = "start".asInstanceOf[TextAnchorType]
  @inline def MIDDLE = "middle".asInstanceOf[TextAnchorType]
  @inline def END = "end".asInstanceOf[TextAnchorType]
  @inline def INHERIT = "inherit".asInstanceOf[TextAnchorType]

}

sealed trait VerticalAnchorType extends js.Object

object VerticalAnchorType {

  @inline def START = "start".asInstanceOf[VerticalAnchorType]
  @inline def MIDDLE = "middle".asInstanceOf[VerticalAnchorType]
  @inline def END = "end".asInstanceOf[VerticalAnchorType]

}

sealed trait ScalePropType extends js.Object

object ScalePropType {

  @inline def LINEAR = "linear".asInstanceOf[ScalePropType]
  @inline def TIME = "time".asInstanceOf[ScalePropType]
  @inline def LOG = "log".asInstanceOf[ScalePropType]
  @inline def SQRT = "sqrt".asInstanceOf[ScalePropType]

}

sealed trait InterpolationPropType extends js.Object

object InterpolationPropType {

  @inline def BASIS = "basis".asInstanceOf[InterpolationPropType]
  @inline def BASISCLOSED = "basisClosed".asInstanceOf[InterpolationPropType]
  @inline def BASISOPEN = "basisOpen".asInstanceOf[InterpolationPropType]
  @inline def BUNDLE = "bundle".asInstanceOf[InterpolationPropType]
  @inline def CARDINAL = "cardinal".asInstanceOf[InterpolationPropType]
  @inline def CARDINALCLOSED =
    "cardinalClosed".asInstanceOf[InterpolationPropType]
  @inline def CARDINALOPEN = "cardinalOpen".asInstanceOf[InterpolationPropType]
  @inline def CATMULLROM = "catmullRom".asInstanceOf[InterpolationPropType]
  @inline def CATMULLROMCLOSED =
    "catmullRomClosed".asInstanceOf[InterpolationPropType]
  @inline def CATMULLROMOPEN =
    "catmullRomOpen".asInstanceOf[InterpolationPropType]
  @inline def LINEAR = "linear".asInstanceOf[InterpolationPropType]
  @inline def LINEARCLOSED = "linearClosed".asInstanceOf[InterpolationPropType]
  @inline def MONOTONEX = "monotoneX".asInstanceOf[InterpolationPropType]
  @inline def MONOTONEY = "monotoneY".asInstanceOf[InterpolationPropType]
  @inline def NATURAL = "natural".asInstanceOf[InterpolationPropType]
  @inline def RADIAL = "radial".asInstanceOf[InterpolationPropType]
  @inline def STEP = "step".asInstanceOf[InterpolationPropType]
  @inline def STEPAFTER = "stepAfter".asInstanceOf[InterpolationPropType]
  @inline def STEPBEFORE = "stepBefore".asInstanceOf[InterpolationPropType]

}

sealed trait ScatterSymbolType extends js.Object

object ScatterSymbolType {

  @inline def CIRCLE = "circle".asInstanceOf[ScatterSymbolType]
  @inline def DIAMOND = "diamond".asInstanceOf[ScatterSymbolType]
  @inline def PLUS = "plus".asInstanceOf[ScatterSymbolType]
  @inline def SQUARE = "square".asInstanceOf[ScatterSymbolType]
  @inline def STAR = "star".asInstanceOf[ScatterSymbolType]
  @inline def TRIANGLEDOWN = "triangleDown".asInstanceOf[ScatterSymbolType]
  @inline def TRIANGLEUP = "triangleUp".asInstanceOf[ScatterSymbolType]

}
