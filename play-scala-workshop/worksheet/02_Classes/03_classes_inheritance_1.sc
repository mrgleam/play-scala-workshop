// base class
class Employee {
  def work = println("bug bug")
  private def eat = println("yum yum")
  protected def sleep = {
    eat
    println("clock clock")
  }
}

class Partnership {
  val share = 1000000
}

// single inheritance
// derived class
class Programmer extends Employee {
  def awake = {
//    eat
    sleep
    println("kuk kuk")
  }
}

val bob = new Programmer
bob.work
//bob.eat
//bob.sleep
bob.awake
