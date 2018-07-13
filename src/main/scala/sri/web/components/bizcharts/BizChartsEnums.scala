package sri.web.components.bizcharts

import scala.scalajs.js;

sealed trait AlignX extends js.Object

object AlignX {

  @inline def LEFT = "left".asInstanceOf[AlignX]
  @inline def MIDDLE = "middle".asInstanceOf[AlignX]
  @inline def RIGHT = "right".asInstanceOf[AlignX]

}

sealed trait AlignY extends js.Object

object AlignY {

  @inline def TOP = "top".asInstanceOf[AlignY]
  @inline def MIDDLE = "middle".asInstanceOf[AlignY]
  @inline def BOTTOM = "bottom".asInstanceOf[AlignY]

}

sealed trait CoordType extends js.Object

object CoordType {

  @inline def RECT = "rect".asInstanceOf[CoordType]
  @inline def POLAR = "polar".asInstanceOf[CoordType]
  @inline def THETA = "theta".asInstanceOf[CoordType]
  @inline def HELIX = "helix".asInstanceOf[CoordType]

}

sealed trait CrosshairsType extends js.Object

object CrosshairsType {

  @inline def RECT = "rect".asInstanceOf[CrosshairsType]
  @inline def X = "x".asInstanceOf[CrosshairsType]
  @inline def Y = "y".asInstanceOf[CrosshairsType]
  @inline def CROSS = "cross".asInstanceOf[CrosshairsType]

}

sealed trait FacetType extends js.Object

object FacetType {

  @inline def RECT = "rect".asInstanceOf[FacetType]
  @inline def LIST = "list".asInstanceOf[FacetType]
  @inline def CIRCLE = "circle".asInstanceOf[FacetType]
  @inline def TREE = "tree".asInstanceOf[FacetType]
  @inline def MIRROR = "mirror".asInstanceOf[FacetType]
  @inline def MATRIX = "matrix".asInstanceOf[FacetType]

}

sealed trait GeomType extends js.Object

object GeomType {

  @inline def POINT = "point".asInstanceOf[GeomType]
  @inline def PATH = "path".asInstanceOf[GeomType]
  @inline def LINE = "line".asInstanceOf[GeomType]
  @inline def AREA = "area".asInstanceOf[GeomType]
  @inline def INTERVAL = "interval".asInstanceOf[GeomType]
  @inline def POLYGON = "polygon".asInstanceOf[GeomType]
  @inline def EDGE = "edge".asInstanceOf[GeomType]
  @inline def SCHEMA = "schema".asInstanceOf[GeomType]
  @inline def HEATMAP = "heatmap".asInstanceOf[GeomType]
  @inline def POINTSTACK = "pointStack".asInstanceOf[GeomType]
  @inline def POINTJITTER = "pointJitter".asInstanceOf[GeomType]
  @inline def POINTDODGE = "pointDodge".asInstanceOf[GeomType]
  @inline def INTERVALSTACK = "intervalStack".asInstanceOf[GeomType]
  @inline def INTERVALDODGE = "intervalDodge".asInstanceOf[GeomType]
  @inline def INTERVALSYMMETRIC = "intervalSymmetric".asInstanceOf[GeomType]
  @inline def AREASTACK = "areaStack".asInstanceOf[GeomType]
  @inline def SCHEMADODGE = "schemaDodge".asInstanceOf[GeomType]

}

sealed trait GeomAdjustType extends js.Object

object GeomAdjustType {

  @inline def STACK = "stack".asInstanceOf[GeomAdjustType]
  @inline def DODGE = "dodge".asInstanceOf[GeomAdjustType]
  @inline def JITTER = "jitter".asInstanceOf[GeomAdjustType]
  @inline def SYMMETRIC = "symmetric".asInstanceOf[GeomAdjustType]

}

sealed trait Marker extends js.Object

object Marker {

  @inline def CIRCLE = "circle".asInstanceOf[Marker]
  @inline def SQUARE = "square".asInstanceOf[Marker]
  @inline def BOWTIE = "bowtie".asInstanceOf[Marker]
  @inline def DIAMOND = "diamond".asInstanceOf[Marker]
  @inline def HEXAGON = "hexagon".asInstanceOf[Marker]
  @inline def TRIANGLE = "triangle".asInstanceOf[Marker]
  @inline def TRIANGLE_DOWN = "triangle-down".asInstanceOf[Marker]
  @inline def HOLLOWCIRCLE = "hollowCircle".asInstanceOf[Marker]
  @inline def HOLLOWSQUARE = "hollowSquare".asInstanceOf[Marker]
  @inline def HOLLOWBOWTIE = "hollowBowtie".asInstanceOf[Marker]
  @inline def HOLLOWDIAMOND = "hollowDiamond".asInstanceOf[Marker]
  @inline def HOLLOWHEXAGON = "hollowHexagon".asInstanceOf[Marker]
  @inline def HOLLOWTRIANGLE = "hollowTriangle".asInstanceOf[Marker]
  @inline def HOLLOWTRIANGLE_DOWN =
    "hollowTriangle-down".asInstanceOf[Marker]
  @inline def CROSS = "cross".asInstanceOf[Marker]
  @inline def TICK = "tick".asInstanceOf[Marker]
  @inline def PLUS = "plus".asInstanceOf[Marker]
  @inline def HYPHEN = "hyphen".asInstanceOf[Marker]
  @inline def LINE = "line".asInstanceOf[Marker]

}

sealed trait Position extends js.Object

object Position {

  @inline def TOP = "top".asInstanceOf[Position]
  @inline def BOTTOM = "bottom".asInstanceOf[Position]
  @inline def LEFT = "left".asInstanceOf[Position]
  @inline def RIGHT = "right".asInstanceOf[Position]

}
