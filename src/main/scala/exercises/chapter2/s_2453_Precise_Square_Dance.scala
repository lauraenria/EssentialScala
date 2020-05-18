package exercises.chapter2

class Precise_Square_Dance {
  /*
  Book: Essential Scala Chapter 2
  Exercise 2.4.5.3 Precise Square Dance!
  Copy and paste calc from the previous exercise to create a calc2 that is
  generalized to work with Ints as well as Doubles . If you have Java experience,
  this should be fairly straightforward. If not, read the solution below.
*/
}

object calc2 {
  def square(x:Double):Double = x*x
  def cube(y:Double):Double = square(y)*y

  def square(x:Int):Int = x*x
  def cube(y:Int):Int = square(y)*y
}

object test extends App {
  println(calc2.square(2))
  println(calc2.square(3.0))
  println(calc2.cube(4))

}