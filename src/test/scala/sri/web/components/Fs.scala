package sri.web.components

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
trait Fs extends js.Object {

  def readFileSync(file: String | js.Any, encoding: String): String = js.native

  def writeFileSync(file: String,
                    data: js.Any | String,
                    options: js.Object = js.native): Unit = js.native
}

@js.native
@JSImport("fs", JSImport.Namespace)
object Fs extends Fs
