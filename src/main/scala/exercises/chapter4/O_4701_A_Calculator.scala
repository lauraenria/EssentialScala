package exercises.chapter4

class O_4701_A_Calculator {
  /*
  implement a simple interpreter for programs containing
  only numeric operations.

  abstract syntax tree.
  */
}

sealed trait Expression {
  def eval: Double = {
    this match {
      case addition: Addition => ???
      case subtraction: Subtraction => ???
    }
  }
}
final case class Addition(left: Expression, right: Expression) extends Expression
final case class Subtraction(left: Expression, right: Expression) extends Expression
final case class Number(value: Double) extends Expression
final case class Division (left: Expression, right: Expression) extends Expression
final case class SquareRoot(value:Double) extends Expression




object CalculationTest {
  assert(Addition(SquareRoot(Number(-1.0)), Number(2.0)).eval == Failure("Square root of negative number"))
//  assert(Addition(SquareRoot(Number(4.0)), Number(2.0)).eval == Success(4.0))
//  assert(Division(Number(4), Number(0)).eval == Failure("Division byzero"))
}