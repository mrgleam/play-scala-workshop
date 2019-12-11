package exercises

import org.scalatest.{FreeSpec, Matchers}

class QuickSortImperativeSpec extends FreeSpec with Matchers {
  val quickSort = new QuickSortImperative

  "quick sort exercise" in {
    quickSort of Array(6, 2, 8, 5, 1) shouldBe Array(1, 2, 5, 6, 8)
    quickSort of Array(60, 2, 100, 5, 1) shouldBe Array(1, 2, 5, 60, 100)
  }
}
