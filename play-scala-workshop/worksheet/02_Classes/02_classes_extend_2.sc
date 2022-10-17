import scala.language.postfixOps
// Infix, prefix, postfix notations (syntactic sugar)

class Person(val name: String, favoriteBook: String) {
  def likes(book: String): Boolean = book == favoriteBook
  def readWith(person: Person): String = s"${this.name} is reading a book with ${person.name}"

  def unary_! : String = "bang bang bang"

  def isYellow: Boolean = true

  def apply(): String = s"Hi, my name is $name and I like $favoriteBook"
}

val bob = new Person("Bob", "How to design programs")
println(bob.likes("How to design programs"))
println(bob likes "How to design programs") // infix notation

val alice = new Person("Alice", "")
println(bob readWith alice)

// prefix notation
val x = -1
val y = 1.unary_-
// unary_{prefix} only works with - + ~ !

println(!bob)
println(bob.unary_!)

// postfix notation
bob.isYellow
bob isYellow

// apply
bob.apply()
bob()