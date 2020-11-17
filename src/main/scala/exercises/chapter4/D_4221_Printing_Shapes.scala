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
/*
object Draw extends App {
  def apply(shape: Shape): String = shape match {
    case Rectangle(width, height) =>
      s"A rectangle of width ${width}cm and height ${height}cm"
    case Square(size)   => s"A square of size ${size}cm"
    case Circle(radius) => s"A circle of radius ${radius}cm"
  }
}
 */
