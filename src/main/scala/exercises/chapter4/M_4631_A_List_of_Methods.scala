package exercises.chapter4

class M_4631_A_List_of_Methods

sealed trait IntList {
  def length:Int = {
    this match {
      case End => 0
      case Pair(head, tail) => 1 + tail.length
    }
  }
}

// Stack and Recursion => Read again

case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

object A_List_of_Methods extends App{
  val example = Pair(1, Pair(2, Pair(3, End)))
  val simplestRecursionExample = Pair(50, End)

  println(simplestRecursionExample.length)

//  assert(length(example) == 3)
//  assert(example.length == 3)
//  assert(example.tail.length == 2)
//  assert(End.length == 0)
}