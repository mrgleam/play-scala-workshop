/**
 * Map Iteration
 */

val mapExample = Map(
 1 -> "one",
 2 -> "two",
 3 -> "three"
)

/**
 * Unpack the Tuple with for expression
 */

for((first, second) <- mapExample) {
 println(s"${first} ${second}")
}