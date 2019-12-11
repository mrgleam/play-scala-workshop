package exercises

import org.scalatest.{FreeSpec, Matchers}

class PalindromeSpec  extends FreeSpec with Matchers {
  val palindrome = new Palindrome

  "is even should work correctly" ignore {
    palindrome of "Hello" shouldBe "No"
    palindrome of "Wow" shouldBe "Yes"
    palindrome of "Anna" shouldBe "Yes"
    palindrome of "Civic" shouldBe "Yes"
    palindrome of "Kayak" shouldBe "Yes"
    palindrome of "Level" shouldBe "Yes"
    palindrome of "Clock" shouldBe "No"
  }
}
