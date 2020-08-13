package exercises.chapter5

class B_5132_Working_With_Generic_Types {
  /*
    Implement length , returning the length of the LinkedList.
    Some test cases are below.
   */
}
//sealed trait LinkedList[A] {
//  def length():Int= {
//    this match {
//      case End() => 0
//      case Pair(_, tail) => 1 + tail.length
//    }
//}
final case class Pair[A](head:A,tail: LinkedList[A]) extends LinkedList[A]
final case class End[A]() extends LinkedList[A]



object test_Working_With_Generic_Types_part1 extends App {

  val exampleString = Pair("1", Pair("2", Pair("3", End())))
  val example = Pair(1, Pair(2, Pair(3, End())))
  assert(example.length == 3)
  assert(example.tail.length == 2)
  assert(End().length == 0)
  assert(exampleString.tail.length == 2)
}

/*
  JVM Java Virtual Machine

  On the JVM we can compare all values for equality. Implement a method
  contains that determines whether or not a given item is in the list. Ensure
  your code works with the following test cases:
 */


sealed trait LinkedList[A] {
  def length():Int= {
    this match {
      case End() => 0
      case Pair(_, tail) => 1 + tail.length
    }
  }
  def contains[A](value:A):Boolean = {
    case End() => false
    case Pair(head, tail) => if (value == head) true else tail.contains(value)
  }
}


object test_Working_With_Generic_Types_part2 extends App {

  val example = Pair(1, Pair(2, Pair(3, End())))
  assert(example.contains(3) == true)
  assert(example.contains(4) == false)
  assert(End().contains(0) == false)
  // This should not compile
  // example.contains("not an Int")
}

/*
  Implement a method apply that returns the nth item in the list
  Hint: If you need to signal an error in your code (there’s one situa on in which
  you will need to do this), consider throwing an excep on. Here is an example:
  throw new Exception("Bad things happened")

  test cases:
 */


object test_Working_With_Generic_Types_part3 extends App {

//  val example = Pair(1, Pair(2, Pair(3, End())))
//  assert(example(0) == 1)
//  assert(example(1) == 2)
//  assert(example(2) == 3)
//  assert(try {
//    example(3)
//    false
//  } catch {
//    case e: Exception => true
//  })

}