package exercises.chapter4

class O_4701_A_Calculator {
  /*
  implement a simple interpreter for programs containing
  only numeric operations.

  abstract syntax tree.
  */
}

import scala.math.sqrt

sealed trait Expression {
  def eval: Double = {
    this match {
      case Addition(l, r) => l.eval + r.eval
      case Subtraction(l, r) => l.eval - r.eval
      case Division(l,r) => l.eval / r.eval
      case SquareRoot(v) => sqrt(v.eval)
      case Number (v) => v
    }
  }
}
final case class Addition(left: Expression, right: Expression) extends Expression
final case class Subtraction(left: Expression, right: Expression) extends Expression
final case class Number(value: Double) extends Expression
final case class Division (left: Expression, right: Expression) extends Expression
final case class SquareRoot(value:Expression) extends Expression



object CalculationTest {
  assert(Addition(SquareRoot(Number(-1.0)), Number(2.0)).eval == Failure("Square root of negative number"))
  assert(Addition(SquareRoot(Number(4.0)), Number(2.0)).eval == Success(4.0))
  assert(Division(Number(4), Number(0)).eval == Failure("Division byzero"))
}

/*
Questions:
=> l.eval - r.eval
 */