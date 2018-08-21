package sri.web.components.bizcharts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
@js.native
@JSImport("bizcharts", JSImport.Namespace)
object BizCharts extends js.Object {

  val G2: G2 = js.native

}
@js.native
trait G2 extends js.Object {

  val Global: G2Global = js.native

}

@js.native
trait G2Global extends js.Object {
  val colors: js.Array[String] = js.native
}
