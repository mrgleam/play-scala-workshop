package exercises

/**
 * Source :
 *    http://rosettacode.org/wiki/Sorting_algorithms/Quicksort#Scala
 *    http://blog.vogella.com/2009/11/13/quicksort-in-scala/
 *    http://www.scala-lang.org/docu/files/ScalaByExample.pdf (chapter 2, page 3)
 */
class QuickSort {

  def of(xs: Array[Int]): Array[Int] = {
    if (xs.length < 2) {
      xs
    } else {
      val pivot = xs(xs.length / 2)
      of(xs filter (pivot > _)) ++ Array(pivot) ++ of(xs filter (pivot < _))
    }
  }

  def of(xs : List[Int]) : List[Int] = {
    xs match {
      case x :: Nil => xs
      case x :: ys => {
        val pivot = x
        of (ys filter (pivot > _)) ::: List(pivot) ::: of (ys filter (pivot < _))
      }
      case Nil =>  Nil
    }
  }
}
