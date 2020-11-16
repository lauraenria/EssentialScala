package examples.chapter3

class A_35_Pattern_Matching {
  /*
    Now imagine we wanted to implement a Stormtrooper that is looking for
    members of the rebellion. We could use pattern matching.
   */
}

case class Person(firstname:String, surname:String)

object Stormtrooper {
  def inspect(person: Person): String =
    person match {
      case Person("Luke", "Skywalker") => "Stop, rebel scum!"
      case Person("Han", "Solo") => "Stop, rebel scum!"
      case Person(first, last) => s"Move along, $first"
    }
}

object A_35_Pattern_Matching_Test  extends App {
  println(Stormtrooper.inspect(Person("Luke", "Skywalker")))
  println(Stormtrooper.inspect(Person("Han", "Solo")))
  println(Stormtrooper.inspect(Person("Jessie", "Oldershaw")))
}