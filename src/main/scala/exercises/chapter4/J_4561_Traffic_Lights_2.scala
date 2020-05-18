package exercises.chapter4

class J_4561_Traffic_Lights_2 {
  /*
  When we implement methods using pattern matching in an external object
  we can provide multiple implementations, one per object (multiple Diner s in
  the example above).
*/
}

trait TrafficLight

case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

object test {
  def next: TrafficLight =
    this match {
      case Red => Green
      case Green => Yellow
      case Yellow => Red
    }
}