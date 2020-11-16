package examples.chapter3

class B_3163_Directorial_Debut {
  /*
  Write two classes, Director and Film ,
  with fields and methods as follows in the obj below

    class Name(parameter: type, ...) {
      declarationOrExpression ...
      }

      class Person {
      val firstName = "Noel"
      val lastName = "Welsh"
      }

      ps. case class (firstName = "Noel",lastName = "Welsh")

      for declaring methods
      def name(parameter: type, ...): resultType = bodyExpression

      def square(in: Double): Double = ???

      Implement a method of Film called copy. This method should accept the
      same parameters as the constructor and create a new copy of the film. Give
      each parameter a default value so you can copy a film changing any subset of
      its values
  */
}

class Director(val firstname:String,
               val surname:String,
               val yearOfBirth:Int){

  def name: String = s"$firstname $surname"

  def copy(firstname:String = this.firstname, surname:String = this.surname, yearOfBirth:Int= this.yearOfBirth ):Director = {
    new Director(firstname,surname,yearOfBirth)
  }
}


class Film(val name:String, val yearOfRelease:Int, val grade:Double, val director: Director){
  def isDirectedBy(director: Director): Boolean = {
    this.director == director
  }

  def copy(name:String = this.name, yearOfRelease:Int = this.yearOfRelease, grade:Double = this.grade, director: Director = this.director ):Film = {
    new Film(name, yearOfRelease,grade,director)
  }

}

object B_3163_Directorial_Debut_test extends App {

  val eastwood:Director = new Director("Clint", "Eastwood", 1930)
  val mcTiernan:Director = new Director("John", "McTiernan", 1951)
  val nolan:Director = new Director("Christopher", "Nolan", 1970)
  val someBody:Director = new Director("Just", "Some Body", 1990)
  val memento:Film = new Film("Memento", 2000, 8.5, nolan)
  val darkKnight:Film = new Film("Dark Knight", 2008, 9.0, nolan)
  val inception:Film = new Film("Inception", 2010, 8.8, nolan)
  val highPlainsDrifter:Film = new Film("High Plains Drifter", 1973, 7.7,eastwood)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9,eastwood)
  val unforgiven:Film = new Film("Unforgiven", 1992, 8.3, eastwood)
  val granTorino:Film = new Film("Gran Torino", 2008, 8.2, eastwood)
  val invictus:Film = new Film("Invictus", 2009, 7.4, eastwood)
  val predator:Film = new Film("Predator", 1987, 7.9, mcTiernan)
  val dieHard:Film = new Film("Die Hard", 1988, 8.3, mcTiernan)
  val huntForRedOctober:Film = new Film("The Hunt for Red October", 1990,7.6, mcTiernan)
  val thomasCrownAffair:Film = new Film("The Thomas Crown Affair", 1999, 6.8,mcTiernan)

  println(eastwood.yearOfBirth)
  // res16: Int = 1930
  println(  dieHard.director.name)
  // res17: String = John McTiernan
  println(  invictus.isDirectedBy(nolan))
  // res18: Boolean = false

  println(highPlainsDrifter.copy(name = "L'homme des hautes plaines"))
  //  res19: Film = Film(L'homme des hautes plaines,1973,7.7,Director(Clint,Eastwood,1930))
  println(thomasCrownAffair.copy(yearOfRelease = 1968,director = new Director("Norman", "Jewison", 1926)))
  // res20: Film = Film(The Thomas Crown Affair,1968,6.8,Director(Norman ,Jewison,1926))

  inception.copy().copy().copy()
  //   res21: Film = Film(Inception,2010,8.8,Director(Christopher,Nolan,1970))
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

case class Film2(title:String, director:String)

object Films extends App {
  val Eastwood = Film("Dunno", "Eastwood")
  println(Dad.rate(Eastwood))
}
 */