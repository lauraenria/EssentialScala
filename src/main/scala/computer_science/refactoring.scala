package computer_science

import exercises.chapter4.A_List_of_Methods.example

class refactoring

class Factorial {
  def factorial(input:Int):Int = {
    input match {
      case 0 => 1
      case 1 => 1
      case _ => factorial(input -1) * input
    }
  }
}

object Test extends Factorial with App {
  val fact = new Factorial()
  assert(fact.factorial(5) == 120)
  assert(fact.factorial(1) == 1)
}