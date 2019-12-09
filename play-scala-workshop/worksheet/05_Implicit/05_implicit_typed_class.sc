// go to test/basics/ImplicitExampleSpec

/**
 * Life without type classes
 */
case class Person(firstName: String, lastName: String)

object PersonCanChat {
  def chat(x: Person) = s"Hi, I'm ${x.firstName}"
}

PersonCanChat.chat(Person("John", "Smith"))

case class Dog(name: String)

object DogCanChat {
  def chat(x: Dog) = s"Woof, my name is ${x.name}"
}

DogCanChat.chat(Dog("Meg"))