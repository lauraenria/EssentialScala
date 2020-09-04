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

sealed trait LinkedList_1[A] {
  def length: Int =
    this match {
      case Pair_1(hd, tl) => 1 + tl.length
      case End_1()        => 0
    }
}

final case class Pair_1[A](head: A, tail: LinkedList_1[A])
    extends LinkedList_1[A]
final case class End_1[A]() extends LinkedList_1[A]

//Se questo match e' un istanza generica di LinkedList

object test_5132_Working_With_Generic_Types_part1 extends App {

  val exampleString = Pair_1("1", Pair_1("2", Pair_1("3", End_1())))
  val example = Pair_1(1, Pair_1(2, Pair_1(3, End_1())))
  assert(example.length == 3)
  assert(example.tail.length == 2)
  assert(End_1().length == 0)
  assert(exampleString.tail.length == 2)
}

/*
 JVM Java Virtual Machine

 On the JVM we can compare all values for equality. Implement a method
 contains that determines whether or not a given item is in the list. Ensure
 your code works with the following test cases:
 */
/*
sealed trait LinkedList[A] {
  def length: Int =
    this match {
      case Pair(hd, tl) => 1 + tl.length
      case End()        => 0
    }

  def contains(item: A): Boolean = {
    this match {
      case End()        => false
      case Pair(hd, tl) => hd == item || tl.contains(item)
    }
  }
}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
final case class End[A]() extends LinkedList[A]

//mistake: hd == item || tl == item

object test_5132_Working_With_Generic_Types_part2 extends App {
  val example = Pair(1, Pair(2, Pair(3, End())))
  assert(example.contains(3) == true)
  assert(example.contains(4) == false)
  assert(End().contains(0) == false)
  // This should not compile
  // example.contains("not an Int")
}
 */

/*
 Implement a method apply that returns the nth item in the list
 Hint: If you need to signal an error in your code (there’s one situation in which
 you will need to do this), consider throwing an except on. Here is an example:
 throw new Exception("Bad things happened")

 test cases:
 */

/*
sealed trait LinkedList[A] {
  def apply(index:Int):A = this match {
    case Pair(hd,tl) => if (index == 0) hd else tl.apply(index-1)
    case End()  => throw new Exception("Bad things happened")
  }
}


object test_5132_Working_With_Generic_Types_part3 extends App {
  val example = Pair(1, Pair(2, Pair(3, End())))
  assert(example(0) == 1)
  assert(example(1) == 2)
  assert(example(2) == 3)
  assert(try {
    example(3)
    false
  } catch {
    case e: Exception => true
  })
}
 */

/*
Change apply so it returns a Result , with a failure case indicating what went
wrong.
 */

sealed trait LinkedList_4[A] {
  def apply(index: Int): Result[A] = this match {
    case Pair_4(hd, tl) =>
      if (index == 0) Success(hd) else tl.apply(index - 1)
    case End_4() => Failure("Index out of bounds")
  }
}

//for let i = 0, i < array.length: i++

object test_5132_Working_With_Generic_Types_part4 extends App {
  val example = Pair_4(1, Pair_4(2, Pair_4(3, End_4())))
  assert(example(0) == Success(1))
  assert(example(1) == Success(2))
  assert(example(2) == Success(3))
  assert(example(3) == Failure("Index out of bounds"))
}

final case class Pair_4[A](head: A, tail: LinkedList_4[A])
    extends LinkedList_4[A]
final case class End_4[A]() extends LinkedList_4[A]
case class Triple[A](head: A, tail: LinkedList_4[A]) extends LinkedList_4[A] // apply wont work

sealed trait Result[A]
case class Success[A](result: A) extends Result[A]
case class Failure[A](reason: String) extends Result[A]
