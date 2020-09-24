package examples.chapter5

class I_553_Functors_and_Monads {
  /*
     A type like F[A] with a map method is called a functor.
     If a functor also has a flatMap method it is called a monad.

     For a monad we require a constructor,typically called point,
     and there are some algebraic laws that our map and flatMap operations
     must obey.

     The general idea is a monad represents a value in some context.

     They are used in in collection classes like lists,
     and sequencing computations.

     We use map when we want to transform the value within the context to a
     new value, while keeping the context the same. We use flatMap when we want
     to transform the value and provide a new context.

     Imagine we have a number of computations that can fail.
 */
}
sealed trait Maybe[A] {

  def flatMap[B](fn: A => Maybe[B]): Maybe[B] = {
    this match {
      case Full(v) => fn(v)
      case Empty() => Empty[B]()
    }
  }

  def mightFail1: Maybe[Int] = Full(1)
  def mightFail2: Maybe[Int] = Full(2)
  def mightFail3: Maybe[Int] = Empty() // This one failed

  //  We want to run these computations one after another. If any one of them fails
  // the whole computation fails.

  /* mightFail1 flatMap (
    x => mightFail2 flatMap (y => mightFail3 flatMap (z => Full(x + y + z)))) */

  mightFail1 flatMap { x =>
    mightFail2 flatMap { y =>
      Full(x + y)
    }
  }
// Full(3)
}

final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]
