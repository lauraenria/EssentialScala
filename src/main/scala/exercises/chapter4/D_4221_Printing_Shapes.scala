package exercises.chapter4

class D_4221_Printing_Shapes {
  /*
    Book: Essential Scala Chapter 4
    Exercise 4.2.2.1 Printing Shapes
    First make Shape a sealed trait.
    Then write a singleton object called Draw with
    an apply method that takes a Shape as an argument
    and returns a description of it on the console.

    Draw(Circle(10))
    // res1: String = A circle of radius 10.0cm
    Draw(Rectangle(3, 4))
    // res2: String = A rectangle of width 3.0cm and height 4.0cm
 */
}

// trait Shape ...
sealed trait Shape {
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

object Draw extends App {
  val square: Square = Square(22)
  def apply(shape: Shape): String = shape match {
    case Square(size) => s"A square of size $size cm"
    case Rectangle(width, height) =>
      s"A rectangle of width ${width}cm and height ${height}cm"
    case Circle(radius) => s"A circle of radius ${radius}cm"
  }
  println(Draw(square))

  Draw(Circle(10))
  // res1: String = A circle of radius 10.0cm
  Draw(square)
  // res2: String = A square of size 22.0cm
}
