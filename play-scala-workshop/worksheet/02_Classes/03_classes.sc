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

/**
 * Accessing private members
 */
class Foo {
  private val secret = 2
}

object Foo {
  // access the private class field 'secret'
  def double(foo: Foo) = foo.secret * 2
}

val f = new Foo
println(Foo.double(f))  // prints 4

/**
 * Accessing private members
 */

class Bar {
  // access the private object field 'obj'
  def printObj { println(s"I can see ${Bar.obj}") }
}

object Bar {
  private val obj = "Bar's object"
}

val g = new Bar
g.printObj
