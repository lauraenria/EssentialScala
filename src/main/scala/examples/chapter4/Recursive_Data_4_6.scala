package examples.chapter4
import scala.annotation.tailrec

class Recursive_Data_4_6

sealed trait IntList
case object End extends IntList
final case class Pair(head:Int, tail:IntList) extends IntList



object RecursiveData  extends IntList {
  //  This data structure is known as a singly-linked list
  Pair(1, Pair(2, Pair(3, End)))

  val d = End
  val c = Pair(3, d)
  val b = Pair(2, c)
  val a = Pair(1, b)

  val z = Pair(1, End)
  val y = Pair(1,z)
  val x = Pair(1,y)
}

/*
For the base case we should generally return the identity
The identity is an element that doesn’t change the result. E.g. 0 for addition

For the recursive case, assume the recursion will return the correct result
and work out what you need to add to get the correct answer


We can apply the same structural recursion patterns to process a recursive
algebraic data type. The only wrinkle is that we must make a recursive call
when the data definition is recursion.
*/

object toDo extends IntList with App {
  val example = Pair(1, Pair(2, Pair(3, End)))
  assert(sum(example) == 6)
  assert(sum(example.tail) == 5)
  assert(sum(End) == 0)
  @tailrec
  def sum(list: IntList, total:Int = 0): Int = {
    list match {
//      case End => 0
//      case Pair(hd, tl) => hd + sum(tl)
      case End => total
      case Pair(hd,tl) => sum(tl, total + hd)
    }
  }
}

/*
Recursive Algebraic Data Types Pattern
there must be at least
two cases: one that is recursive, and one that is not.
Cases that are not recursive are known as base cases.
 */

sealed trait RecursiveExample
final case class RecursiveCase(recursion:RecursiveExample) extends RecursiveExample
// why?
case object BaseCase extends RecursiveExample

/* 4.6.2 Tail Recursion (to stop recursive funcs consuming stack space.)
A tail call is a method call where the caller immediately returns the value.*/

case class Example(){
  def method1:Int = 1

  def tailCall:Int = method1

  def notTailCall: Int = method1 + 2
}

/*Due to limitations in the
JVM, Scala only optimises tail calls where the caller calls itself.
we can use the @tailrec annotation to ask the compiler to check
that methods we believe are tail recursion really are.
*/
