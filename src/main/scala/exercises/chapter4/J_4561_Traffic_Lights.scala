package exercises.chapter4

class J_Traffic_Lights {
  /*
  In the previous sec on we implemented a TrafficLight data type like so:
  sealed trait TrafficLight
  case object Red extends TrafficLight
  case object Green extends TrafficLight
  case object Yellow extends TrafficLight
  Using polymorphism and then using pa ern matching implement a method
  called next which returns the next TrafficLight in the standard Red ->
  Green -> Yellow -> Red cycle. Do you think it is be er to implement this
  method inside or outside the class? If inside, would you use pa ern matching
  or polymorphism? Why?
  */
}

/*
sealed trait TrafficLight {
  def next:TrafficLight
}
case object Red extends TrafficLight {
  def next: TrafficLight = Green
}

case object Green extends TrafficLight {
  def next: TrafficLight = Yellow
}

case object Yellow extends TrafficLight{
  def next: TrafficLight = Red
}
*/

//sealed trait TrafficLight {
//  def next: TrafficLight =
//    this match {
//      case Red => Green
//      case Green => Yellow
//      case Yellow => Red
//    }
//}
//
//
//case object Red extends TrafficLight
//case object Green extends TrafficLight
//case object Yellow extends TrafficLight


/*
When we implement methods using pattern matching in an external object
we can provide multiple implementations, one per object (multiple Diner s in
the example above).
 */
