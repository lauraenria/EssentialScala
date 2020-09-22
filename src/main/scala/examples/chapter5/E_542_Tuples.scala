package examples.chapter5

class E_542_Tuples {
  /*
  A tuple is the generalisation of a pair to more terms. Scala includes built-in
  generic tuple types with up to 22 elements, along with special syntax for
  creating them.

  The classes are called Tuple1[A] through to Tuple22[A, B, C, ...] but
  they can also be written in the sugared2 form (A, B, C, ...) .
 */
}

object E_542_Tuples extends App {

  Tuple2("hi", 1) // unsugared syntax
  // res2: (String, Int) = (hi,1)
  ("hi", 1) // sugared syntax
  // res3: (String, Int) = (hi,1)
  ("hi", 1, true)
  // res4: (String, Int, Boolean) = (hi,1,true)

  // We can define methods that accept tuples as parameters using the same syntax

  def tuplized1[A, B](in: (A, B)) = in._1
  // tuplized: [A, B](in: (A, B))A
  tuplized1(("a", 1))
  // res5: String = a

  def tuplized2[A, B](in: (A, B)) = in._2
  // tuplized: [A, B](in: (A, B))B
  tuplized2(("a", 1))
  // res5: String = 1

  (1, "a") match {
    case (a, b) => a + b
  }
  // res6: String = 1a

  // Although pattern matching is the natural way to deconstruct a tuple, each class
  // also has a complement of fields named _1 , _2 and so on:
  val x = (1, "b", true)
  // x: (Int, String, Boolean) = (1,b,true)
  x._1
  // res7: Int = 1
}
