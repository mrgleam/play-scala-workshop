/**
 * Vars and Vals
 * A val is a final variable definition, it cannot be re-assigned with a different value.
 */

val a = 10

//a = 11

/**
 * A var is a mutable variable definition, it can be re-assigned with a different value.
 * with another value of the same type
 */

var b = 10

b = 11

//b = "ten"

/**
 * Val and new scope
 */

val c = 10
print(c)

{ // start a new scope
  val c = 11
  print(c)
}

print(c)