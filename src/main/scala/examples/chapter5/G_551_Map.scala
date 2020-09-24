package examples.chapter5

class G_551_Map {
  /*
    The method that performs this opera on is called map

    we want to get a List[User].
    we have List[Int] and  function Int => User

    we want Maybe[Order]
    we have Maybe[User] and a function User => Order

    we have Sum[String, Order] and a function Order => Double
    we want Sum[String, Double]

    we have a type F[A] and a function A => B
    we want a result F[B]

    Let’s implement map for LinkedList

    fold (which is just the structural recursion pa ern abstracted)
    is the universal iterator for an algebraic data type.
 */
}

sealed trait LinkedList[A] {
  def map[B](fn: A => B): LinkedList[B] = this match {
    case Pair(hd, tl) => {
      val newTail: LinkedList[B] = tl.map(fn)
      newTail
      // Combine newTail and head to create LinkedList[B]
    }
    case Pair(head, tail) => Pair(fn(head), tail.map(fn))
    case End()            => End[B]()
  }
}

case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
case class End[A]() extends LinkedList[A]
