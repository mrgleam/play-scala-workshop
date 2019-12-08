/**
 * https://alvinalexander.com/scala/how-to-use-pattern-matching-scala-match-case-expressions
 */
case class Person(firstName: String, lastName: String)
case class Dog(name: String)

def echoWhatYouGaveMe(x: Any): String = x match {

  // constant patterns
  case 0 => "zero"
  case true => "true"
  case "hello" => "you said 'hello'"
  case Nil => "an empty List"

  // sequence patterns
  case List(0, _, _) => "a three-element list with 0 as the first element"
  case List(1, _*) => "a list beginning with 1, having any number of elements"
  case Vector(1, _*) => "a vector starting with 1, having any number of elements"

  // tuples
  case (a, b) => s"got $a and $b"
  case (a, b, c) => s"got $a, $b, and $c"

  // constructor patterns
  case Person(first, "Alexander") => s"found an Alexander, first name = $first"
  case Dog("Suka") => "found a dog named Suka"

  // typed patterns
  case s: String => s"you gave me this string: $s"
  case i: Int => s"thanks for the int: $i"
  case f: Float => s"thanks for the float: $f"
  case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
  case as: Array[String] => s"an array of strings: ${as.mkString(",")}"
  case d: Dog => s"dog: ${d.name}"
  case list: List[_] => s"thanks for the List: $list"
  case m: Map[_, _] => m.toString

  // the default wildcard pattern
  case _ => "Unknown"
}

echoWhatYouGaveMe(0)
echoWhatYouGaveMe(true)
echoWhatYouGaveMe("hello")
echoWhatYouGaveMe(Nil)

echoWhatYouGaveMe(List(0,1,2))
echoWhatYouGaveMe(List(1,2))
echoWhatYouGaveMe(List(1,2,3))
echoWhatYouGaveMe(Vector(1,2,3))

echoWhatYouGaveMe((1,2))
echoWhatYouGaveMe((1,2,3))

echoWhatYouGaveMe(Person("Melissa", "Alexander"))
echoWhatYouGaveMe(Dog("Suka"))

echoWhatYouGaveMe("Hello, world")
echoWhatYouGaveMe(42)
echoWhatYouGaveMe(42F)
echoWhatYouGaveMe(Array(1,2,3))
echoWhatYouGaveMe(Array("coffee", "apple pie"))
echoWhatYouGaveMe(Dog("Fido"))
echoWhatYouGaveMe(List("apple", "banana"))
echoWhatYouGaveMe(Map(1->"Al", 2->"Alexander"))

echoWhatYouGaveMe(None)