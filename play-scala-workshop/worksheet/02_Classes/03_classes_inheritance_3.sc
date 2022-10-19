abstract class Employee {
  val name: String
//  val bonus: Int = 300
  val bonus: Int
  def work: Unit
}

//class Programmer extends Employee
class Programmer(override val name: String) extends Employee {
  override val bonus: Int = 500
  def work: Unit = println("bug bug")
}

trait SoftwareEngineer {
  def work(employee: Employee): Unit
//  val salary: Int = 500000
}

// do not have constructor parameters
//trait SoftwareEngineer(name: String) {
//  def work(employee: Employee): Unit
//}

trait Teacher
class Developer(override val name: String) extends Employee with SoftwareEngineer with Teacher {
  val bonus: Int = 1000
  def work: Unit = println("it work on my machine")
  def work(employee: Employee): Unit = println(s"I'm a bug and I'm working for ${employee.name}")
}

val bob = new Developer("Bob")
val alice = new Developer("Alice")

bob.work
bob.work(alice)