package example

class MyLibrary {

  def sq(x: Int): Int = x * x

  def someSqs(max: Int = 10): String = {
    val values = List.range(1, max)
    val sqs = values.map(v => sq(v))
    sqs.mkString("--")
  }
}
