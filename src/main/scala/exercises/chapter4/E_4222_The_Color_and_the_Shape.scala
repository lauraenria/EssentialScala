package exercises.chapter4

class E_4222_The_Color_and_the_Shape {
  /*
    Book: Essential Scala Chapter 4
    Exercise 4.2.2.2 The Color and the Shape
    Write a sealed trait Color to make our shapes more interesting.
    • give Color three proper es for its RGB values;
    • create three predefined colours: Red , Yellow , and Pink ;
    • provide a means for people to produce their own custom Colors with
    their own RGB values;
    • provide a means for people to tell whether any Color is “light” or “dark”.

    Finally, update the code for Draw.apply to print the colour of the argument
    as well as its shape and dimensions:
    • if the argument is a predefined colour, print that colour by name:
    Draw(Circle(10, Yellow))
    // res8: String = A yellow circle of radius 10.0cm
    • if the argument is a custom colour rather than a predefined one, print
    the word “light” or “dark” instead.
 */
}
/*
// Shape uses Color so we define Color first:
sealed trait Color {
  // We decided to store RGB values as doubles between 0.0 and 1.0.
  //
  // It is always good practice to define abstract members as `defs`
  // so we can implement them with `defs`, `vals` or `vars`.
  def red: Double
  def green: Double
  def blue: Double
  // We decided to define a "light" colour as one with
  // an average RGB of more than 0.5:
  def isLight: Boolean = (red + green + blue) / 3.0 > 0.5
  def isDark: Boolean = !isLight
}
case object Red extends Color {
  // Here we have implemented the RGB values as `vals`
  // because the values cannot change:
  val red = 1.0
  val green = 0.0
  val blue = 0.0
}
case object Yellow extends Color {
  // Here we have implemented the RGB values as `vals`
  // because the values cannot change:
  val red = 1.0
  val green = 1.0
  val blue = 0.0
}
case object Pink extends Color {
  // Here we have implemented the RGB values as `vals`
  // because the values cannot change:
  val red = 1.0
  val green = 0.0
  val blue = 1.0
}

// We decided to overload the `Draw.apply` method for `Shape` and
// `Color` on the basis that we may want to reuse the `Color` code
// directly elsewhere:
object Draw extends App {
  def apply(shape: Shape): String = shape match {
    case Circle(radius, color) =>
      s"A ${Draw(color)} circle of radius ${radius}cm"
    case Square(size, color) =>
      s"A ${Draw(color)} square of size ${size}cm"
    case Rectangle(width, height, color) =>
      s"A ${Draw(color)} rectangle of width ${width}cm and height ${height}cm"
  }

  // The arguments to the case class here generate `val` declarations
  // that implement the RGB methods from `Color`:
  final case class CustomColor(red: Double, green: Double, blue: Double)
      extends Color
  // The code from the previous exercise comes across almost verbatim,
  // except that we add a `color` field to `Shape` and its subtypes:
  sealed trait Shape {
    def sides: Int
    def perimeter: Double
    def area: Double
    def color: Color
  }
  final case class Circle(radius: Double, color: Color) extends Shape {
    val sides = 1
    val perimeter: Double = 2 * math.Pi * radius
    val area: Double = math.Pi * radius * radius
  }
  sealed trait Rectangular extends Shape {
    def width: Double
    def height: Double
    val sides = 4
    val perimeter: Double = 2 * width + 2 * height
    val area: Double = width * height
  }
  final case class Square(size: Double, color: Color) extends Rectangular {
    val width: Double = size
    val height: Double = size
  }
  final case class Rectangle(width: Double, height: Double, color: Color)
      extends Rectangular

  def apply(color: Color): String = color match {
    // We deal with each of the predefined Colors with special cases:
    case Red    => "red"
    case Yellow => "yellow"
    case Pink   => "pink"
    case color  => if (color.isLight) "light" else "dark"
  }

  // Test code:
  Draw(Circle(10, Pink))
  // res29: String = A pink circle of radius 10.0cm
  Draw(Rectangle(3, 4, CustomColor(0.4, 0.4, 0.6)))
  // res30: String = A dark rectangle of width 3.0cm and height 4.0cm
}
 */
