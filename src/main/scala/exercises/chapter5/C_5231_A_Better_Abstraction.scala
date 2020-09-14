package exercises.chapter5

class C_5231_A_Better_Abstraction {
  /*
    A function literal is an alternate syntax for defining a function.
    It's useful for when you want to pass a function as an argument to a method
    Function literals are anonymous. But you can give them a name by binding them to a variable.

    Rename this function to fold , which is the name it is usually known as, and
    finish the implementation.

    Now reimplement sum , length , and product in terms of fold .

    The syntax for declaring a function literal is
    (parameter: type, ...) => expression

    Lambda Expression refers to an expression
    that uses an anonymous function instead of variable or value.

    val b:Int => Int => Int = x => x + 8
    val c:(Int,Int,Int) => String = (x,y,z) => s"$x $y $z"

    def A(n:Int, f:Int => Int): String = f(n).toString
    def hightOrderFunction(n:Int, f:Int => Int): Int = f(n)

    hightOrderFunction(7,b)            // 15
    hightOrderFunction(7, x => x * 2 ) // 14
    hightOrderFunction(7, x => 2)      // 2
 */
}
/*
//abstraction over sum , length , and product
sealed trait IntList {
  def fold(end:Int,f:(Int,Int) => Int):Int = {
    this match {
      case End => end
      case Pair(hd, tl) => f(hd,tl.fold(end, f))
    }
  }
  def sum:Int = fold(0,(hd, tl) => hd + tl)
  def length:Int = fold(0,(_,tl) => 1+tl)
  def product:Int = fold(1,(hd,tl)=> hd * tl)

/* we need to generalise the types of fold from Int to some general type
  def double: IntList = this match {
    case End => end
    case Pair(hd, tl) => f(hd,tl.fold(end, f))
  }
 */
}

final case class Pair(head:Int,tail: IntList) extends IntList
case object End extends IntList

 */

/*
  Is it more convenient to rewrite methods in terms of fold if they were implemented
  using pattern matching or polymorphic?
  What does this tell us about the best use of fold?

  We should use pattern matching to avoid code duplication
 */

/* Implement a generalised version of fold and rewrite double in terms of it.
   def name[A](...){ ... }
 */
/*
sealed trait IntList {
  def fold[A](end: A, f: (Int, A) => A): A = {
    this match {
      case End          => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }
  }

  val x: (Int, Int) => Int = (hd, tl) => hd + tl
  def sum_0: Int = fold[Int](0, x)

  def sum: Int = fold[Int](0, (hd, tl) => hd + tl)
  def length: Int = fold[Int](0, (_, tl) => 1 + tl)
  def product: Int = fold[Int](1, (hd, tl) => hd * tl)
  def double: IntList = fold[IntList](End, (hd, tl) => Pair(hd * 2, tl))
}

final case class Pair(head: Int, tail: IntList) extends IntList
case object End extends IntList

object C_5231_A_Better_Abstraction_Test extends App {

  val example = Pair(3, Pair(2, End))
  println(example)
}
 */
