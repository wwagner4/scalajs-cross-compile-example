package example

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.Promise

import scala.scalajs.js.Date

class MyJsLibrary extends MyLibrary with MySleeper {
  override def sleep(ms: Int) = {
    val start = Date.now()
    // Not good code but shows the usage of platform specific code
    while (Date.now() < start + ms) {}
  }
}

