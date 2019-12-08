/**
 * Sequence
 * List, Array and Vector, subtypes of Seq
 */

val arrA = Array(1,2,3)
val listA = List(1,2,3)
val v = Vector(1,2,3,4,5)

def addOne(xs: Seq[Int]): Seq[Int] = {
  xs.map(x => x+1)
}

addOne(v)
addOne(listA)
//addOne(arrA)