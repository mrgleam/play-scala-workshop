class Too

/**
 * Code in the class becomes the primary constructor
 * run when a new instance is constructed
 */

class TooMuch {
//  println("Creating TooMuch")
  val x = 10
  val y = 20

  def addX(a: Int): Int = a + x
}

val tooMuch = new TooMuch

tooMuch.x

tooMuch.addX(1)

class VeryMuch(name: String) {
  println(s"Hello ${name}")

  def sayHi(): Unit = {
    println(s"Hi ${name}")
  }
}

val veryMuch = new VeryMuch("Too")

veryMuch.sayHi()

/**
 * can not access the constructor parameters (private)
 */

//veryMuch.name