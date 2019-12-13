def dont(codeBlock: => Unit) = new {
  def unless(condition: => Boolean) = if (condition) codeBlock

  def until(condition: => Boolean) = {
    while (!condition) {}
    codeBlock
  }
}

dont {
  println("Yes, 2 is greater than 1")
} unless (2 > 1)

var number = 0
def nextNumber = {
  number += 1
  println(number)
  number
}

dont {
  println("Done counting to 5.")
} until (nextNumber == 5)
