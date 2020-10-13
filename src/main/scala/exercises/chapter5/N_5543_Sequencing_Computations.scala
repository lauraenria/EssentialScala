package exercises.chapter5
import exercises.chapter5.M_5542_Mapping_Maybe

class N_5543_Sequencing_Computations {
  /*
    We’re going to use Scala’s builtin List class for this exercise as it has a
    flatMap method. Given this list

    val list = List(1, 2, 3)

    return a List[Int] containing both all the elements and their negation.
    Order is not important. Hint: Given an element create a list containing it and its
    negation.

    val list = List(3,2,1,-1-2,-3)

    Given this list

    val list: List[Maybe[Int]] = List(Full(3), Full(2), Full(1))

    return a List[Maybe[Int]] containing None for the odd elements. Hint: If
    x % 2 == 0 then x is even

 */
}
/*
trait Maybe[A] {
  def map[B](fn: A => B): Maybe[B] = {
    this match {
      case Full(value) => Full(fn(value))
      case Empty()     => Empty[B]()
    }
  }

  def flatMap[B](fn: A => Maybe[B]): Maybe[B] =
    this match {
      case Full(v) => fn(v)
      case Empty() => Empty[B]()
    }

}

final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]



object N_5543_Sequencing_Computations_Test extends App {
  val list1 = List(1, 2, 3)
  val list2: List[Maybe[Int]] = List(Full(3), Full(2), Full(1))

`val exercise2 =  list2.map( maybe => maybe.flatMap[Int] {
    value => if (value % 2 == 0) Full(value) else Empty()
  } )
  //  List(
  //  Full(3), Full(2), Full(1)
  //  )

  val exercise1 = list1.flatMap(x => List(x, -x))
  // List(
  // List(1, -1)
  // List(2, -2)
  // List(3, -3)
  // )
  // => List(1,-1,2-2,3,-3)
}
 */
