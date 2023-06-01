/**
 * A variable is a place in memory where you can store a single piece of data.
 * Each variable is associated with a name.
 * Programmers can reference, modify, or set the value of a variable using its name.
 * Variables can also have associated types, such as integer, Boolean, or float.
 * These types indicate what kind of information can be stored in the corresponding variable.
 * - Computational Fairy Tales
 */

/**
 * Vars and Vals
 * A var is a mutable variable definition, it can be re-assigned with a different value.
 * with another value of the same type
 */

var a: Int = 10

a = 11

//a = "ten"

/**
 * A val is a final variable definition, it cannot be re-assigned with a different value.
 */

val b: Int = 10

//b = 11

/**
 * Val and new scope
 */

val c: Int = 10
print(c)

{ // start a new scope
  val c: Int = 11
  print(c)
}

print(c)