import scala.language.implicitConversions

//3.chat

class LoquaciousInt(x: Int) {
  def chat: Unit = for(i <- 1 to x) println("Hi!")
}

implicit def intToLoquaciousInt(x: Int): LoquaciousInt = new LoquaciousInt(x)

3.chat