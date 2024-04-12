package example

class MyJvmLibrary extends MyLibrary with MySleeper {
  override def sleep(ms: Int) = {
    Thread.sleep(ms)
  }
}
