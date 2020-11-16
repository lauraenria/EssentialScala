package exercises.chapter3

class P_Get_Off_My_Lawn {
  /*
  Book: Essential Scala Chapter 3
  Exercise 3.5.3.2 Get Off My Lawn!
  In this exercise we’re going to write a simulator
  of my Dad, the movie critic.
  It’s quite simple: any movie directed
  by Clint Eastwood gets a ra ng 10.0,
  any movie directed by John McTiernan gets a 7.0,
  while any other movie gets a 3.0.
  Implement an object called Dad with a method rate which accepts
  a Film and returns a Double.Use pattern matching.
 */
}

/*
object Dad {
  def rate(film: Film):Double = {
    film match {
      case Film(_,"Eastwood") => 10.0
      case Film(_,"McTiernan") => 7.0
      case _ => 3.0
    }
  }
}

case class Film(title:String, director:String)

object Films extends App {
  val Eastwood = Film("Dunno", "Eastwood")
  println(Dad.rate(Eastwood))
}
 */
