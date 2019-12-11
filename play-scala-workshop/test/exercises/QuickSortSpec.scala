package exercises

import org.scalatest.{FreeSpec, Matchers}

class QuickSortSpec extends FreeSpec with Matchers {
  val quickSort = new QuickSort

  "quick sort exercise" in {
    quickSort of Array(4, 5, 1, 0 ,2, 3) shouldBe Array(0, 1, 2, 3, 4, 5)
    quickSort of List(4, 5, 1, 0 ,2, 3) shouldBe List(0, 1, 2, 3, 4, 5)
  }
}

