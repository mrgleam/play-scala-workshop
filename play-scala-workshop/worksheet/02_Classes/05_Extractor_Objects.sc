import scala.util.Random

object CustomerID {

  def apply(name: String) = s"$name--${Random.nextLong}"

  def unapply(customerID: String): Option[String] = {
    val stringArray: Array[String] = customerID.split("--")
    if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
  }
}

val customer1ID = CustomerID("Sukyoung")
customer1ID match {
  case CustomerID(name) => println(name)
  case _ => println("Could not extract a CustomerID")
}

val customer2ID = CustomerID.apply("Nico")
//val CustomerID(name) = customer2ID
val name = CustomerID.unapply(customer2ID).get
println(name)

/**
 * Case classes are good for modeling immutable data.
 * @param isbn
 */
case class Book(isbn: String)

val frankenstein = Book("978-0486282114")

val isbn = Book.unapply(frankenstein)

case class Foo(foo: String, bar: Int)

val (str, in) = Foo.unapply(Foo("test", 123)).get

//why return Option?
//Product1