/**
 * Collection
 */

val arr1: Array[Int] = Array(1,2)
val list1: List[String] = List("Jane", "Proof")

val arr2 = Array("Jane", "Proof")
val list2 = List("Jane", "Proof")

/**
 * Type parameter is not optional
 */

//def lengthOfList(xs: List): Int = xs.size

def lengthOfList(xs: List[Any]): Int = xs.size

def plus2(xs: List[Int]): List[Int] = {
  for (x <- xs) yield x + 2
}

plus2(List(1,2))