import scala.collection.{immutable, mutable}

/**
 * Maps
 */

val m1 = mutable.Map('a' -> 1, 'b' -> 2)
var m2 = immutable.Map('c' -> 3, 'd' -> 4)

m1 ++= m2

m1('a') = 4

m1

m2 += 'e' -> 5

m2

/**
 * -> It's not syntax
 */