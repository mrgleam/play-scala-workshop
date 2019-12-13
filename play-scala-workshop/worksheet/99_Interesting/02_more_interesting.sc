import scala.language.implicitConversions

/**
 * https://gist.github.com/kevinwright/1262988
 * @tparam T
 */
class Filters[T] {

  //Some boilerplate-busting aliases
  type FilterResult = Either[Rejection, T]
  type FilterFunc = (T) => FilterResult

  //Handy helpers
  //Rejection can carry as much info as you wish;
  //  Filter name, value in error, an exception, etc.
  case class Rejection(input: T, msg: String)

  def pass(x: T): FilterResult = Right(x)
  def reject(x: T, msg: String): FilterResult = Left(Rejection(x, msg))

  //The awesome pimp!
  class Chainable(fn: FilterFunc) {
    def +(other: FilterFunc): FilterFunc = (input: T) => fn(input).right flatMap other
  }
  implicit def filterFuncIsChainable(fn: FilterFunc) = new Chainable(fn)
}

object StringFilters extends Filters[String] {

  val rejectNonAlphaNumeric: FilterFunc = (input: String) =>
    if (input.matches(".*[0-9a-zA-z].*")) pass(input)
    else reject(input, "didn't containin any alphanumeric characters")

  val rejectSingleChar: FilterFunc = (input: String) =>
    if (input.length >= 2) pass(input)
    else reject(input, "was a mere single character")

  val convertToUppercase: FilterFunc = (input: String) => pass(input.toUpperCase)

  def rejectOverLength(maxLength: Int): FilterFunc = (input: String) =>
    if (input.length < maxLength) pass(input)
    else reject(input, "was over " + maxLength + " characters long")
}

import StringFilters._

val processor = rejectNonAlphaNumeric + rejectSingleChar + rejectOverLength(20) + convertToUppercase


processor("hello world")

processor("x")

processor("22")

processor("_")

processor("__")

processor("''")

processor("abcdefghijklmnopqrstuvwxyz")
