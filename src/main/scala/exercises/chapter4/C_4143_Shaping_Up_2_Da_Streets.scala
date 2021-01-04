package exercises.chapter4

class C_4143_Shaping_Up_2_Da_Streets {
  /*
    Book: Essential Scala Chapter 4
    Exercise 4.1.4.3 Shaping Up 2 (Da Streets)
    The solution from the last exercise delivered three dis not types of shape.
    However, it doesnt model the relationships between the three correctly. A
    Square isn’t just a Shape —it’s also a type of Rectangle where the width and
    height are the same.
    Refactor the solution to the last exercise so that Square and Rectangle are
    subtypes of a common type Rectangular .
    Tip: A trait can extend another trait.
 */
}
/*
// trait Shape ...
trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}
// case class Circle ...
case class Circle(radius: Double) extends Shape {
  val sides = 1
  val perimeter: Double = 2 * math.Pi * radius
  val area: Double = math.Pi * radius * radius
}

sealed trait Rectangular extends Shape {
  def width: Double
  def height: Double
  val sides = 4
  override val perimeter: Double = 2 * width + 2 * height
  override val area: Double = width * height
}
case class Square(size: Double) extends Rectangular {
  val width: Double = size
  val height: Double = size
}
case class Rectangle(val width: Double, val height: Double) extends Rectangular

object Shape {
  val square: Square = Square(22)
}
 */
