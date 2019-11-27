/**
 * Tuples
 * We want to return more than one thing from a method
 */

def sumAndDiff(a: Int, b: Int): (Int, Int) = {
  val sum = a + b
  val diff = a - b
  (sum, diff)
}

val result = sumAndDiff(1,2)
result._1
result._2

val (s: Int, df: Int) = sumAndDiff(1,2)
s
df

/**
 * Tuples
 * mixed types
 * Tuples can have arity up to 22,
 * because it had to stop some where
 */

val tub5 = (0, '1', 2, 3, "four")
tub5._5
tub5._2

val (a,b,c,d,e) = tub5
a
b