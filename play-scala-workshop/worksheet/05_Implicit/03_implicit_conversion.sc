import scala.language.implicitConversions

/**
 * implicit conversion
 */

class TooMuch {
  def add(a: Int, b: Int): Int = a + b
}

object TooMuch {
  def apply(x: Int, y: Int) = {
    val tooMuch = new TooMuch
    tooMuch.add(x, y)
  }
}

implicit def stringToInt(c: String) = c.toInt
val tooMuch = TooMuch(1, "1")