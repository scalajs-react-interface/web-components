package sri.web.components.bizcharts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("@antv/data-set", JSImport.Default)
class DataSet(initialProps: js.Object = ???) extends js.Object {

  def createView(name: String = ???, options: js.Object = ???): View =
    js.native

  @js.native
  class View extends js.Object {

    def source(data: js.Any, options: js.Object = ???): this.type = js.native

    def transform(options: js.Object): this.type = js.native
  }

}
