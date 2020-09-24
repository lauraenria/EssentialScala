package exercises.chapter5

class J_5462_Folding_Maybe {
  /*
    In this section we implemented a sum type for modelling optional data.
    Implement fold for this type.
 */
}

sealed trait Maybe1[A] {
  def fold[B](full: A => B, empty: B): B = this match {
    case Full1(value) => full(value)
    case Empty1()     => empty
  }
}

final case class Full1[A](value: A) extends Maybe1[A]
final case class Empty1[A]() extends Maybe1[A]
