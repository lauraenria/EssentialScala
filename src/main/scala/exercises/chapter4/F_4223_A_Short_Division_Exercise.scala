package exercises.chapter4

class F_4223_A_Short_Division_Exercise {
  /*
    Book: Essential Scala Chapter 4
    Exercise 4.2.2.3 A Short Division Exercise

    val x = divide(1, 2)
    // x: DivisionResult = Finite(0)
    val y = divide(1, 0)
     // y: DivisionResult = Infinite
    Write some sample code that calls divide,
    matches on the result, and returns a sensible description.
 */
}

sealed trait DivisionResult
final case class Finite(value: Int) extends DivisionResult
case object Infinite extends DivisionResult
object divide {
  def apply(num: Int, den: Int): DivisionResult =
    if (den == 0) Infinite else Finite(num / den)

  divide(1, 0) match {
    case Finite(value) => s"It's finite: ${value}"
    case Infinite      => s"It's infinite"
  }
}

// res34: String = It's infinite
