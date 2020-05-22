package exercises.chapter4

class K_4562_Calculation()

sealed trait Calculation
final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation

object Calculator {
  def +(c:Calculation, n:Int): Calculation = ???
  def -(c:Calculation, n:Int): Calculation = ???
}