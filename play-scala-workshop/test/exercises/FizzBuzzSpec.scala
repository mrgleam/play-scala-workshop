package exercises

import org.scalatest.{FreeSpec, Matchers}

class FizzBuzzSpec extends FreeSpec with Matchers {
  val fizzBuzz = new FizzBuzz

  "FizzBuzz exercise" ignore {

    "FizzBuzz should return fizz if the number is dividable by 3" in {
      fizzBuzz.getResult(3) should be ("fizz")
      fizzBuzz.getResult(6) should be ("fizz")
    }

    "FizzBuzz should return buzz if the number is dividable by 5" in {
      fizzBuzz.getResult(5) should be ("buzz")
      fizzBuzz.getResult(10) should be ("buzz")
    }

    "FizzBuzz should return fizzbuzz if the number is dividable by 15" in {
      fizzBuzz.getResult(15) should be ("fizzbuzz")
      fizzBuzz.getResult(30) should be ("fizzbuzz")
    }

    "FizzBuzz should return the same number if no other requirement is fulfilled" in {
      fizzBuzz.getResult(1) should be ("1")
      fizzBuzz.getResult(2) should be ("2")
      fizzBuzz.getResult(4) should be ("4")
    }
  }
}