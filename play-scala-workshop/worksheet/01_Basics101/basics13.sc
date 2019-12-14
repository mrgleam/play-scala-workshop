import scala.collection._

/**
 * Mutable and Immutable
 */

val s1 = mutable.Set(1,2,3)
var s2 = immutable.Set(1,2,3)

s1 += 4 // works because s1 has a += operator

s2 += 4 // works because s2 is var
//s2 = s2 + 4 // Scala uses a re-write to this
s2

val xs = List(1,2,3)

//xs = 0 :: xs

//xs(1) = 99

var listA = List(1,2,3)
listA = 0 :: listA
listA

/**
 * Common mistake
 * Do not use var and mutable in the same time
 */

var s3 = s1

s3 += 5

s1