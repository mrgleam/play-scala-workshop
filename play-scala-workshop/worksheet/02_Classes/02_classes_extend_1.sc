class Person(name: String, val age: Int) {

  // method
  def sayHi(name: String): Unit = println(s"${name} says: Hi, $name")
//  def sayHi(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading ?? polymorphism
  def sayHi(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0) // can default params age: Int = 0 and remove this line
  def this() = this("Little")
}

val bob = new Person("Bob", 18)
bob.age
bob.sayHi("Alice")
bob.sayHi()

val little = new Person
little.age
little.sayHi()