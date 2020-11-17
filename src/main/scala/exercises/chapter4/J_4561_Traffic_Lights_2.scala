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
      case Red    => Green
      case Green  => Yellow
      case Yellow => Red
    }

  println(next(Red))
}

sealed trait Rainbow
case class Pink() extends Rainbow
//case object Red extends Rainbow
case object Orange extends Rainbow
//case object Yellow extends Rainbow
case object GreenBlue extends Rainbow
case object Blue extends Rainbow
case object Indigo extends Rainbow

sealed trait LivingBeing
case class Crab() extends LivingBeing
case class Tiger() extends LivingBeing
case class Bee() extends LivingBeing
case class Frog() extends LivingBeing
case class Whale() extends LivingBeing
case class Birds() extends LivingBeing
case class Pig() extends LivingBeing

object Body {
  def matchColor(living: LivingBeing): Rainbow =
    living match {
//      case Crab()  => Red
      case Tiger() => Orange
      case Frog()  => GreenBlue
      case Whale() => Blue
      case Birds() => Indigo
      case Pig()   => Pink()
    }
}
