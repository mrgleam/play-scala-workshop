/**
 * Loops, such as the FOR loop or WHILE loop,
 * are programming constructs for repeating a set of instructions until some termination criterion is met.
 * Two primary things define a loop:
 *  1) What you do inside the loop, and
 *  2) the conditions to stop looping.
 * - Computational Fairy Tales
 */

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

for (a <- 1 to 10) {
  println("Value of a: " + a);
}