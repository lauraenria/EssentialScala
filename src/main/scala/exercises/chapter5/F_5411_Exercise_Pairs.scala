package exercises.chapter5

class F_5411_Exercise_Pairs {
  /*
    Implement the Pair class from above. It should store two values— one and
    two —and be generic in both arguments. Example usage:
 */
}

case class Pair_5411[A, B](one: A, two: B)

object F_5411_Exercise_Pairs extends App {

  val pair = Pair_5411[String, Int]("hi", 2)
  println(pair)
  // pair: Pair[String,Int] = Pair(hi,2)
  println(pair.one)
  // res0: String = hi
  println(pair.two)
  // res1: Int = 2
}
