package exercises.chapter4

class K_4562_Calculation()

sealed trait Calculation
final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation

object Calculator extends App {
  def +(c:Calculation,n:Int): Calculation = {
    c match {
      case Success(result) => Success(result + n)
      case Failure(reason) => Failure(reason)
    }
  }

  def -(c:Calculation, n:Int): Calculation  = {
    c match {
      case Success(result) => Success(result - n)
      case Failure(reason) => Failure(reason)
    }
  }

  assert(Calculator.+(Success(1), 1) == Success(2))
  assert(Calculator.+(Success(1), 2) == Success(3))
  assert(Calculator.-(Success(1), 1) == Success(0))
  assert(Calculator.+(Failure("Badness"), 1) == Failure("Badness"))
}
