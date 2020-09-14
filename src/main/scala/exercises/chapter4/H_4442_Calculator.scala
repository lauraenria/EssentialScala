package exercises.chapter4

class H_4442_Calculator {
  /*
    Book: Essential Scala Chapter 4
    Exercise 4.4.4.2 Calculator
    A calculation may succeed (with an Int result)
    or fail (with a String message).
    Implement this.

    Why did they choose to use a sealed keyword in this exercise?
    Why sealed trait exists?
  */
}


sealed trait Calculation
final case class Success(result: Int) extends Calculation
final case class Failure(reason: String) extends Calculation