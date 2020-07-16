package exercises.chapter4

class O_4701_A_Calculator {

}


import scala.math.sqrt

sealed trait Expression {
  def eval: Double
}
final case class Addition(left: Expression, right: Expression) extends Expression {
  override def eval: Double = left.eval + right.eval
}
final case class Subtraction(left: Expression, right: Expression) extends Expression {
  override def eval: Double = left.eval - right.eval
}
final case class Number(value: Double) extends Expression {
  override def eval: Double = value
}
final case class Division (left: Expression, right: Expression) extends Expression {
  override def eval: Double = left.eval / right.eval
}
final case class SquareRoot(value:Expression) extends Expression {
  override def eval: Double = sqrt(value.eval)
}



object CalculationTest extends App {

  val example1 = Number(2)
  val example2 = Addition(Number(9.6), Number(16.2))
  val example3 = Subtraction(Number(99.6), Number(19.2))
  val example4 = Addition(Addition(Number(9.6), Number(16.2)),Subtraction(Number(99.6), Number(19.2)))

  println(example1.eval)
  println(example2.eval)
  println(example3.eval)
  println(example4.eval)

    assert(Addition(SquareRoot(Number(-1.0)), Number(2.0)).eval == Failure("Square root of negative number"))
  //  assert(Addition(SquareRoot(Number(4.0)), Number(2.0)).eval == Success(4.0))
  assert(Division(Number(4), Number(0)).eval == Failure("Division byzero"))

}