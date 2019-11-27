/**
 * while and do..while
 * while is a statement
 * while is non-functional
 * while still use for performance
 * while must have side effect
 */

var a = 0

while (a < 5) {
  println(s"a is ${a}")
  a += 1
}

a = 0

do {
  println(s"a is ${a}")
  a += 1
} while(a < 5)