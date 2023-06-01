/**
 * Arrays and linked lists are both simple data structures that store multiple values in memory.
 * These data structures differ in how they store and allow access to the data.
 * Arrays are like a set of bins with a fixed number of slots.
 * Their structure makes it easy to read from or write to an arbitrary element in the array.
 * In contrast, linked lists are easily expandable chains of data.
 * However, you must scan to the correct location in the chain to read or modify a piece of data in that node.
 * - Computational Fairy Tales
 */

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