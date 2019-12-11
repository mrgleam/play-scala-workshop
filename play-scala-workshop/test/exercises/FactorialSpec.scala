package exercises

import org.scalatest.{FreeSpec, Matchers}

/**
 * Recursion
 * n! = n * (n - 1) * (n - 2) * (n - 3) * ... * 3 * 2 * 1
 * 0! = 1
 * 1! = 1
 * 2! = 2 * 1
 * 3! = 3 * 2 * 1
 * 4! = 4 * 3 * 2 * 1
 */

class FactorialSpec extends FreeSpec with Matchers {
  val factorial = new Factorial
  "factorial exam" ignore {
    factorial of 0 shouldBe 1
    factorial of 1 shouldBe 1
    factorial of 2 shouldBe 2
    factorial of 3 shouldBe 6
    factorial of 4 shouldBe 24
  }
}
