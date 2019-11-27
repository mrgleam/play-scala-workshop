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

/**
 * Method with no return types
 * In Scala, every method has a type, there is no void
 */

def talk(lang: String): Unit = {
  println(s"Talk ${lang}")
}

/**
 * Method with no return types
 * procedure syntax
 */

def speak(lang: String) {
  println(s"Talk ${lang}")
}

/**
 * A common mistake
 */

def plus(a: Int, b: Int) {
  a + b
}

plus(2,3)