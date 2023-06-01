/**
 * IF-ELSE statements allow programs to branch off and execute one of two different blocks of code.
 * The IF statement starts by evaluating a Boolean (true/false) clause.
 * If this clause evaluates to true, then the block of code conditioned on the IF statement is executed.
 * Otherwise, it is skipped.
 * An ELSE clause can be included to provide an alternate block of code in the cases where the original Boolean clause evaluates to false.
 * - Computational Fairy Tales
 */

/**
 * If-else expression
 * can return values (unlike many more imperative languages)
 */

val a = 10

val b = 20

val c = if (a > b) a else b

/**
 * can ignore the returned value
 */

var x = 0

if (a > b) {
  x = a
} else {
  x = b
}

x