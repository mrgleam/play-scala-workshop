val add1 = (i: Int) => i + 1

val double = (i: Int) => i * 2

val addThenDouble = add1 andThen double

addThenDouble(1)

val doubleThenAdd = add1 compose double

doubleThenAdd(1)