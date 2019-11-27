/**
 * -> Arrow extension method
 * the result is Tuple
 */

"hi" -> 10

"hi".->(10)

/**
 * -> Arrow extension method
 * no such -> method on Int
 * implicit called ArrowAssoc
 */

1 -> "One"

1.->("One")

ArrowAssoc(1).->("One")