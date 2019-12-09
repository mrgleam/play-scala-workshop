import scala.language.implicitConversions

/**
 * implicit conversion
 */

def alert(msg: String): Unit = {
  println(msg)
}

//alert(7)

implicit def intToString(i: Int): String = i.toString

alert(1)