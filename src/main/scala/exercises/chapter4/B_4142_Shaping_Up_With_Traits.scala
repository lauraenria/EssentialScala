package exercises.chapter4

class B_4142_Shaping_Up_With_Traits {
  /*
  Book: Essential Scala Chapter 4
  Exercise 4.1.4.2 Shaping Up With Traits
  Define a trait called Shape and give it three abstract methods:
  • sides returns the number of sides;
  • perimeter returns the total length of the sides;
  • area returns the area.
 */
}

trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}
case class Circle(radius: Double) extends Shape {
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}
case class Rectangle(width: Double, height: Double) extends Shape {
  val sides = 4
  val perimeter = 2 * width + 2 * height
  val area = width * height
}
case class Square(size: Double) extends Shape {
  val sides = 4
  val perimeter = 4 * size
  val area = size * size
}
