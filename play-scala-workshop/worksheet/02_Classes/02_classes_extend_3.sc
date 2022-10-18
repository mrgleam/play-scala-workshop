object Person {
  val N_LEGS = 2
  def canEat: Boolean = true
}

println(Person.N_LEGS)
println(Person.canEat)

// SINGLETON INSTANCE
val bob = Person
val alice = Person
bob == alice