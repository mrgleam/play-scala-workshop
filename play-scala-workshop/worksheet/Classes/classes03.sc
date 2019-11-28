/**
 * A companion object
 */

class Person {
  var name: String = _
}

object Person {
  def apply(name: String): Person = {
    val p = new Person
    p.name = name
    p
  }
}

val too = Person("Too")

too.name