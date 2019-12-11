package exercises

import org.scalatest.{FreeSpec, Matchers}

class FactorialSpec extends FreeSpec with Matchers {
  val factorial = new Factorial

  "factorial exam" in {
    factorial of 0 shouldBe 1
    factorial of 1 shouldBe 1
    factorial of 2 shouldBe 2
    factorial of 3 shouldBe 6
    factorial of 4 shouldBe 24
  }
}
