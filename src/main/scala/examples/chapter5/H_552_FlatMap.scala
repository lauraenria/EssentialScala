package examples.chapter5

class H_552_FlatMap {
  /*
    this opera on is called flatMap

    we want a result F[B]
    we have a type F[A] and a function A => F[B]

    We have a list of users and we want to get a list of all their orders

    we want LinkedList[Order]
    we have LinkedList[User] and a function User => LinkedList[Order]

    We have an optional value representing a user loaded from the
    database, and we want to lookup their most recent order

    we want Maybe[Order]
    we have Maybe[User] and User => Maybe[Order]

    We have a sum type holding an error message or an Order, and we
    want to email an invoice to the user.

    we want Sum[String,Id]
    we have Sum[String, Order] and a function Order => Sum[String, Id]
 */
}

/*
sealed trait Maybe[A] {
  def flatMap[B](fn: A => Maybe[B]): Maybe[B] = ???
}

final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]

 */

// it’s a structural recursion

sealed trait Maybe[A] {
  def flatMap[B](fn: A => Maybe[B]): Maybe[B] = {
    this match {
      case Full(v) => fn(v)
      case Empty() => Empty[B]()
    }
  }
}

final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]
