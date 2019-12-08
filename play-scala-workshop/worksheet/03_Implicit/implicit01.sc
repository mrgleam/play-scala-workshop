import scala.language.implicitConversions

/**
 * Method with implicit parameter
 */

def plus(a: Int)(implicit b: Int): Int = a + b

plus(1)(10)
//plus(1)

implicit val x: Int = 1
plus(1)

//implicit val z: Int = 11
plus(1)

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
