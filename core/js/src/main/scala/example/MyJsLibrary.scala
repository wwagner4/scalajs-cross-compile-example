package example

import scala.scalajs.js.Date

class MyJsLibrary extends MyLibrary with MySleeper {
  override def sleep(ms: Int) = {
    val start = Date.now()
    // Not good code but shows the usage of platform specific code
    while (Date.now() < start + ms) {}
  }
}
