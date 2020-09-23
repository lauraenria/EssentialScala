package exercises.chapter5

class G_5431_Generic_Sum_Type {
  /*
    Implement a trait Sum[A, B] with two subtypes Left and Right. Create type
    parameters so that Left and Right can wrap up values of two different types.

    Hint: you will need to put both type parameters on all three types.
 */
}

trait Sum[A, B] {
  this match {
    case Left(x)  => x.toString
    case Right(x) => x
  }
}
/*
  def intOString(input: Boolean): Sum[Int, String] = {
    if (input == true) {
      Left[Int, String](123)
    } else {
      Right[Int, String]("abc")
    }
  }
 */

final case class Left[A, B](value: A) extends Sum[A, B]
final case class Right[A, B](value: B) extends Sum[A, B]

object G_5431_Generic_Sum_Type_Test extends App {

  Left[Int, String](1).value
  // res9: Int = 1
  Right[Int, String]("foo").value
  // res10: String = foo
  val sum: Sum[Int, String] = Right("foo")
  // sum: sum.Sum[Int,String] = Right(foo)
  sum match {
    case Left(x)  => x.toString
    case Right(x) => x
  }
  // res11: String = foo
}
