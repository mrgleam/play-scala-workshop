/**
 * Method
 * Note : the = before the function body
 */

def add(a: Int, b: Int): Int = a + b

val a = 10

var b = 20

add(a,b)

/**
 * The return type can be inferred,
 * but the parameter types cannot
 */

// def minus(a, b): Int = a - b
def minus(a: Int, b: Int) = a - b

minus(a,b)