package exercises

import org.scalatest.{FreeSpec, Matchers}

class WordCountSpec extends FreeSpec with Matchers {
  val word = new WordCount

  "Word Count exercise should work correctly" ignore {
    word count "What" shouldBe Map("what" -> 1)
    word count "one of each" shouldBe Map("one" -> 1, "of" -> 1, "each" -> 1)
    word count "one fish two fish red fish blue fish" shouldBe Map(("blue", 1), ("two", 1), ("fish", 4), ("one", 1), ("red", 1))
  }
}