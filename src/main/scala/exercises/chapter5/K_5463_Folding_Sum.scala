package exercises.chapter5

class K_5463_Folding_Sum {
  /*
    In this section we implemented a generic sum type.
    Implement fold for Sum .
 */
}

sealed trait Sum1[A, B] {
  def fold[C](left: A => C, right: B => C): C = this match {
    case Left1(a)  => left(a)
    case Right1(b) => right(b)
  }
}
final case class Left1[A, B](value: A) extends Sum1[A, B]
final case class Right1[A, B](value: B) extends Sum1[A, B]
