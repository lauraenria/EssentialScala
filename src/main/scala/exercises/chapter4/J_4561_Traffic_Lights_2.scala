package exercises.chapter4

class J_4561_Traffic_Lights_2 {
  /*
  When we implement methods using pattern matching in an external object
  we can provide multiple implementations, one per object (multiple Diner s in
  the example above).
*/
}

sealed trait TrafficLight

case object Red extends TrafficLight
case object Green extends TrafficLight
case object Yellow extends TrafficLight

object City extends App {
  def next(trafficLight: TrafficLight): TrafficLight =
    trafficLight match {
      case Red => Green
      case Green => Yellow
      case Yellow => Red
    }

  println(next(Red))
}



sealed trait Rainbow
case class Pink() extends Rainbow
//case object Red extends Rainbow
case object Orange extends Rainbow
//case object Yellow extends Rainbow
case object GreenBlue  extends Rainbow
case object Blue  extends Rainbow
case object Indigo  extends Rainbow


sealed trait LivigBeing
case class Crab() extends LivigBeing
case class Tiger() extends LivigBeing
case class Bee() extends LivigBeing
case class Frog() extends LivigBeing
case class Whale() extends LivigBeing
case class Birds() extends LivigBeing
case class Pig() extends LivigBeing



object Body {
  def matchColor(living : LivigBeing):Rainbow =
    living match {
//      case Crab() => Red
      case Tiger() => Orange
      case Frog() => GreenBlue
      case Whale() => Blue
      case Birds() => Indigo
      case Pig() => Pink()
    }
}
