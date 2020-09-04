package exercises.chapter5

class B_5132_Working_With_Generic_Types {
  /*
    Implement length , returning the length of the LinkedList.
    Some test cases are below.
   */
}

/* Prima soluzione - non esatta

sealed trait LinkedList[A] {
 def length(): Int = this match {
   case aaa: End[A] => 0
   case bbb: Pair[A] => 1 + b.tail.length()
 }
}

//vediamo se questo match e' un instanza specifica di aaa o bbb del tratto LinkedList

*/

/*
sealed trait LinkedList[A] {
 def length: Int =
   this match {
     case Pair(hd, tl) => 1 + tl.length
     case End() => 0
   }
}


//Se questo match e' un istanza generica di LinkedList


object test_Working_With_Generic_Types_part1 extends App {

 val exampleString = Pair("1", Pair("2", Pair("3", End())))
 val example = Pair(1, Pair(2, Pair(3, End())))
 assert(example.length == 3)
 assert(example.tail.length == 2)
 assert(End().length == 0)
 assert(exampleString.tail.length == 2)
}

 */

/*
 JVM Java Virtual Machine

 On the JVM we can compare all values for equality. Implement a method
 contains that determines whether or not a given item is in the list. Ensure
 your code works with the following test cases:
*/


sealed trait LinkedList[A] {
  def length: Int =
    this match {
      case Pair(hd, tl) => 1 + tl.length
      case End() => 0
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

final case class Pair[A](head:A,tail: LinkedList[A]) extends LinkedList[A]
final case class End[A]() extends LinkedList[A]

object test_Working_With_Generic_Types_part3 extends App {



}