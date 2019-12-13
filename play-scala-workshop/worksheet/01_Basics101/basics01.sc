/**
 * Vars and Vals
 * A val is a final variable definition, it cannot be re-assigned with a different value.
 */

val a: Int = 10

//a = 11

/**
 * A var is a mutable variable definition, it can be re-assigned with a different value.
 * with another value of the same type
 */

var b: Int = 10

b = 11

//b = "ten"

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