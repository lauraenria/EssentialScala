package exercises.chapter2

class Square_Dance {
/*
  Book: Essential Scala Chapter 2
  Exercise 2.4.5.2 Square Dance!
  Define an object called calc with a method square that accepts a Double
  as an argument and... you guessed it... squares its input. Add a method called
  cube that cubes its input calling square as part of its result calculation.
*/
}
object calc {
  def square(x:Double):Double = x*x
  def cube(y:Double):Double = square(y)*y
}