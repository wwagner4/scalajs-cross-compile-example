package example

import scala.concurrent.ExecutionContext.Implicits.global

object Main {
  def main(args: Array[String]): Unit = {
    println(s"Using Scala.js version ${System.getProperty("java.vm.version")}")
    val lib = new MyJsLibrary
    for (i <- 1 to 5) {
      lib.sleep(500)
      println(lib.someSqs(i))
    }
  }
}
