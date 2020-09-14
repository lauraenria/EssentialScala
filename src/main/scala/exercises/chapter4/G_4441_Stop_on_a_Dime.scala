package exercises.chapter4

import OLD.LauraAndJessie.Chapter4.TrafficLight

class G_4441_Stop_on_a_Dime {
  /*
    Book: Essential Scala Chapter 4
    Exercise 4.4.4.1 Stop on a Dime
    A traffic light is red, green, or yellow. Translate this description into Scala code.

    Is a = Sum Type
    How the words exits in the real word?
  */
}

sealed trait TrafficLight

case object Green extends TrafficLight
case object Yellow extends TrafficLight
case object Red  extends TrafficLight