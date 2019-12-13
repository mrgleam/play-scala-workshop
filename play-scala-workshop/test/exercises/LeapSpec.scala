package exercises

import org.scalatest.{FreeSpec, Matchers}

class LeapSpec extends FreeSpec with Matchers {
  val leap = new Leap

  "Leap year exercise should work correctly" ignore {
    leap year 1997 shouldBe false
    leap year 1996 shouldBe true
    leap year 2000 shouldBe true
    leap year 1900 shouldBe false
  }
}
