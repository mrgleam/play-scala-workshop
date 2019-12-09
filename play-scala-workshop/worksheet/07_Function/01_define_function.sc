/**
 * 'val' functions
 * It is 100% correct to use the term "function"
 * when referring to it.
 */
val add1 = (i: Int) => i + 1

val double = (i: Int) => i * 2

add1(1)

/**
 * 'def' functions
 * It is not 100% correct to use the term "function"
 * when referring to it. Technically, it is not a function.
 *
 * It is a method that needs to be defined within a class or object.
 */

def addMultipleParams(a: Int, b: Int): Int = a + b

addMultipleParams(1,2)


/**
 * convert the method add into a function
 * @param a
 * @param b
 * @return
 */
def add(a: Int)(b: Int): Int = a + b

add(3)(4)

val addFn = add _

val add2 = addFn(2)

add2(1)