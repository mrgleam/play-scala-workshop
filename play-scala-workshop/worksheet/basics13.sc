import scala.collection._

/**
 * Mutable and Immutable
 */

val s1 = mutable.Set(1,2,3)
var s2 = immutable.Set(1,2,3)

s1 += 4

s2 += 4
//s2 = s2 + 4
s2

val xs = List(1,2,3)

//xs = 0 :: xs

//xs(1) = 99

var listA = List(1,2,3)
listA = 0 :: listA
listA
