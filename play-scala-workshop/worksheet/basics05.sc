/**
 * Try..Catch..Finally expressions
 */

val divided = try {
  10 / 0
} catch {
  case _: ArithmeticException => 0
} finally {
  // side-effecting
  println("This always run, but will not return a value")
  //10
}

val divided2 = try {
  10 / 0
} catch {
  case _: ArithmeticException => throw new RuntimeException("Can not divided by zero")
} finally {
  println("This always run, but will not return a value")
  //10
}