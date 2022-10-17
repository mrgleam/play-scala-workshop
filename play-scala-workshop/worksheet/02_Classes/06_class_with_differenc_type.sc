class MyClass[A](param1: String, param2: A) {
  def getParam2Type: String = param2 match {
    case _: String => "String"
    case _: Int => "Int"
    case _: Double => "Double"
    case _: BigDecimal => "BigDecimal"
    case _: Boolean => "Boolean"
    //          case _: List[Int] => "List of Int"
    //          case _: List[String] => "List of String"
    case _ => "Unknown type"
  }

  override def toString: String = s"param1($param1) with param2($param2, ${getParam2Type})"
}

val c1 = new MyClass("c1", "abcd")
val c2 = new MyClass("c2", 12)
val c3 = new MyClass("c3", true)
val c4 = new MyClass("c4", 0.5)
val c5 = new MyClass("c5", 'a')

val c6 = new MyClass("c6", List(12, 13))
val c7 = new MyClass("c7", List("123", "456"))

import java.lang.Object