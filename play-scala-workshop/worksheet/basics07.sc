/**
 * Expression vs Statement
 * An expression returns with a type
 */

val x: Int = 0
val y: Int = 1

val min: Int = if (x < y) x else y

/**
 * A statement returns Unit and has to have some side effect
 */

if (x < y) println(s"max is ${x}") else println(s"min is ${x}")

/**
 * while and do..while return Unit
 */

var d: Boolean = true

val result = while (d) {
  println("Hi")
  d = false
}