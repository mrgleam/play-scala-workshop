/**
 * try to make it public
 */

class TooMuch(name: String) {
  val aName = name
  println(s"Hello ${name}")

  def sayHi(): Unit = {
    println(s"Hi ${name}")
  }
}

val tooMuch = new TooMuch("Too")

tooMuch.aName

/**
 * use Vals to make it public
 */

class VeryMuch(val name: String) {
  println(s"Hello ${name}")

  def sayHi(): Unit = {
    println(s"Hi ${name}")
  }
}

val veryMuch = new VeryMuch("Too")

veryMuch.sayHi()

veryMuch.name

/**
 * the Scala re-written the above
 */

class SoMuch(_name: String) {
  val name = _name
  println(s"Hello ${name}")

  def sayHi(): Unit = {
    println(s"Hi ${name}")
  }
}

val soMuch = new SoMuch("Too")

soMuch.name

