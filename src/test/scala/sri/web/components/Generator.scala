package sri.web.components

import org.scalajs.dom
import sri.web.components.materialui.MuiGenerator

import scala.scalajs.js.JSON

object Generator {

  //TODO generate correct enums
  def main(args: Array[String]): Unit = {
    println(s"Running in test")
    MuiGenerator.run()

//    val content = Fs.readFileSync("./victory-animation.js", "utf-8")
//    val ast = ReactDocGenJS.parse(content)
//    println(JSON.stringify(ast))
  }

}
