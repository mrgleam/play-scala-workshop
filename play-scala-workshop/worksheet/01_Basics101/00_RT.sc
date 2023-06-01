val x = "Hello, World"

val r1 = x.reverse

val r2 = x.reverse



val y = new StringBuilder("Hello")

val z = y.append(", World")

val r3 = z.toString

val r4 = z.toString

// StringBuilder.append is not pure function
val r5 = y.append(", World")

val r6 = y.append(", World")