package examples.chapter5

class B_52_Functions {
/*
  Functions allow us to abstract over methods

  I’ve used f to denote some kind of object that does the combina on of the
  head and recursive call for the Pair case.

  Unlike a method a function is value

 */
}
/*
sealed trait IntList {
  def abstraction(end:Int,f:???):Int = {
    this match {
      case End => end
      case Pair(hd,tl) => f(hd,tl.abstraction(end,f))
    }
  }
}

case object End extends IntList
case class Pair(hd: Int, tl: IntList) extends IntList
 */

/*
the apply method, lets us treat objects as func ons in a syntactic sense:
 */

object add1 extends App {
  def apply(in: Int) = in + 1

  println(add1(2))
}

/*
  We declare a function type like (A, B,...) => C

  There is no syntax for declaring the
   result type of a func on and it is normally inferred, but if we find ourselves
   needing to do this we can put a type on the func on’s body expression:
   (x: Int) => (x + 1): Int

   The syntax for declaring a function literal is
   (parameter: type, ...) => expression
 */