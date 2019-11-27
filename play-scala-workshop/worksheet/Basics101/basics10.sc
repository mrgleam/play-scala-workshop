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

/**
 * List Initialization
 */

val listA = List(1,2,3)

val listB = 4 :: 5 :: 6 :: 7 :: Nil

/**
 * :: is right associative
 * it applies the parameter on the left side to the item on the right side.
 */

val listC = Nil.::(5).::(4)

val listD = listA.::(0)

/**
 * ::: which joins two lists
 */
val listE = listD ::: listC