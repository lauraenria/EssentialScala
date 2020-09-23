package exercises.chapter5

class J_5462_Folding_Maybe {
  /*
    In this section we implemented a sum type for modelling optional data.
    Implement fold for this type.
 */
}

sealed trait Maybe[A] {
  def fold[B](full: A => B, empty: B): B = this match {
    case Full(value) => full(value)
    case Empty()     => empty
  }
}

final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]
