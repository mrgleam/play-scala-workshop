/**
 * A simple Scala Option example
 * @param in
 * @return
 */
def toInt(in: String): Option[Int] = {
  try {
    Some(Integer.parseInt(in.trim))
  } catch {
    case e: NumberFormatException => None
  }
}

toInt("234") match {
  case Some(i) => println(i)
  case None => println("That didn't work.")
}

toInt("tooMuch") match {
  case Some(i) => println(i)
  case None => println("That didn't work.")
}

/**
 * Why Option is better than null
 * @param in
 * @return
 */
def toIntImp(in: String) = {
  try {
    Integer.parseInt(in.trim)
  } catch {
    case e: NumberFormatException => null
  }
}

val i = toIntImp("too");
if (i == null) {
  System.out.println("That didn't work.");
} else {
  System.out.println(i);
}

/**
 * Let's assume you want to get the sum of a List that
 * contains a bunch of String values,
 * and some of those strings can be converted to Int values,
 * and some can't:
 */
val bag = List("1", "2", "foo", "3", "bar")
