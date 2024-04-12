package example

class MyJvmLibrary extends MyLibrary with MySleeper {
  override def sleep(ms: Int) = {
    Thread.sleep(ms)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println(s"Using a JVM version ${System.getProperty("java.vm.version")}")
    val lib = new MyJvmLibrary
    for (i <- 1 to 5) {
      lib.sleep(500)
      println(lib.someSqs(i))
    }
  }
}
