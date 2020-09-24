package exercises.chapter5

import examples.chapter5.{LinkedList, Pair}

class L_5541_Mapping_Lists {
  /*

        //a simple method
        scala> def m(x: Int) = 2*x
    m: (x: Int)Int

      //a simple function
      scala> val f = (x: Int) => 2*x
      f: (Int) => Int = <function1>

      //a method can't be the final value
      scala> m
      <console>:6: error: missing arguments for method m in object $iw;
      follow this method with `_' if you want to treat it as a partially applied function


      //a function can be the final value
        scala> f
        res11: (Int) => Int = <function1>

    Given the following list

    • double all the elements in the list;
    • add one to all the elements in the list; and
    • divide by three all the elements in the list.


    case Pair(head, tail) => Pair(fn(head), tail.map(fn))
    case End()            => End[B]()
 */
}
/*
sealed trait LinkedList[A] {
  def map[B](fn: A => B): LinkedList[B] = this match {
    case Pair(hd, tl) => Pair(fn(hd), tl.map(fn))
    case End()        => End[B]()
  }
}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
final case class End[A]() extends LinkedList[A]

object L_5541_Mapping_Lists_Test extends App {

  //  def doublingANumber(n: Int): Int = n * 2 // this a method

  def doubleAll: Int => Int = n => n * 2 // this is a function

  def addOneToAllTheElements: Int => Int = n => n + 1 // this is  a function

  def divideByThree: Int => Int = n => n / 3 // this is a function

  val list: LinkedList[Int] =
    Pair(1, Pair(2, Pair(3, Pair(4, Pair(5, Pair(6, End()))))))

  println(list.map(doubleAll).map(addOneToAllTheElements).map(divideByThree))
}
 */
