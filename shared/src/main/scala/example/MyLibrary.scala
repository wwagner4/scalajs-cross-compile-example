package example

class MyLibrary {

  def sq(x: Int): Int = x * x

  def someSqs(): String = {
    val values = List.range(1, 50)
    val sqs = values.map(v => sq(v))
    sqs.mkString("--")
  }
}
