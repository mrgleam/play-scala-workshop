// go to test/basics/ImplicitExampleSpec

/**
 * Life with type classes
 */
trait CanChat[A] {
  def chat(x: A): String
}

final case class Person(firstName: String, lastName: String)

object PersonCanChat extends CanChat[Person] {
  override def chat(x: Person) = s"Hi, I'm ${x.firstName}"
}

final case class Dog(name: String)

object DogCanChat extends CanChat[Dog] {
  override def chat(x: Dog) = s"Woof, my name is ${x.name}"
}

object ChatUtil {
  def chat[A](x: A, chattyThing: CanChat[A]): String = {
    chattyThing.chat(x)
  }
}

//object ChattyAddons {
//  implicit object PersonCanChat extends CanChat[Person] {
//    def chat(x: Person) = s"Hi, I'm ${x.firstName}"
//  }
//  implicit object DogCanChat extends CanChat[Dog] {
//    def chat(x: Dog) = s"Woof, my name is ${x.name}"
//  }
//  implicit class ChatUtil[A](x: A) {
//    def chat(implicit makesChatty: CanChat[A]) = {
//      makesChatty.chat(x)
//    }
//  }
//}
//
//// in another package...
//import ChattyAddons._
//
//Person("John", "Smith").chat

ChatUtil.chat(Dog("Meg"), DogCanChat)
ChatUtil.chat(Person("John", "Smith"), PersonCanChat)

