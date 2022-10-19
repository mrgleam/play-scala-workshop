// constructors
class Employee(val salary: Int) {
  def work = println("bug bug")
  val bonus = 500
}

//class Programmer(salary: Int) extends Employee
class Programmer(salary: Int) extends Employee(salary)

val bob = new Programmer(1000000)

// overriding
class Doctor(salary: Int) extends Employee(salary) {
//  override val bonus = 600
  override def work = println("check check")
//  override def toString: String = s"This is Doctor Class"
}
//Object

//class Doctor(salary: Int, override val bonus: Int) extends Employee(salary) {
//  override def work = println("check check")
//}

//class Doctor(salary: Int, newBonus: Int) extends Employee(salary) {
//  override val bonus = newBonus
//  override def work = {
////    super.work
//    println("check check")
//  }
//}

val b1 = new Doctor(2000000 )
b1.work
b1.bonus

// type substitute
val someEmployee: Employee = new Doctor(50000)
someEmployee.work
someEmployee.salary
someEmployee.bonus

// super

// prevent override
// - final on methods, members
// - final on class
// - sealed on class, it can only extend class in this file.
