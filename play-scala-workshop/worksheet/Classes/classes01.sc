class Too

class TooMuch {
//  println("Creating TooMuch")
  val x = 10
  val y = 20

  def addX(a: Int): Int = a + x
}

val tooMuch = new TooMuch

tooMuch.x

tooMuch.addX(1)