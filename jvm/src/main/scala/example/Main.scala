package example

object Main {
  def main(args: Array[String]): Unit = {
    val lib = new MyLibrary
    println(lib.someSqs())
    println(s"Using a JVM version ${System.getProperty("java.vm.version")}")
  }
}
