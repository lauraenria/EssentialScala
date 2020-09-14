package exercises.chapter3

class C_3163_Directorial_Debut2_CaseClass
/*
Book: Essential Scala Chapter 3
Exercise 3.1.6.3 Directorial Debut

Write two classes, Director and Film ,
with fields and methods as follow in the book
*/
class C_3163_Directorial_Debut

case class Director(firstName: String = "x", lastName: String = "y", yearOfBirth: Double = 1) {
  def name(): String = s"$firstName $lastName"
}

case class Film(name: String = "x", yearOfRelease: Double = 1990, imdbRating: Double = 100, director: Director) {
  def directorsAge(): Double = yearOfRelease - director.yearOfBirth
  def isDirectedBy(otherDirector: Director): Boolean = otherDirector.name == director.name

  def copy(
            name: String = this.name,
            yearOfRelease: Double = this.yearOfRelease,
            imdbRating: Double = this.imdbRating,
            director: Director = this.director): Film = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
}

object C_3163_Directorial_Debut_test extends App {

  def rate(film:Film): Double =
    film match {
      case Film(_,_ ,_ ,Director("Clint", "Eastwood", _)) => 10.0
      case Film(_, _, _, Director("John", "McTiernan", _)) => 7.0
      case _ =>  3.0
    }


  val eastwood = new Director("Clint", "Eastwood", 1930)
  val mcTiernan = new Director("John", "McTiernan", 1951)
  val nolan = new Director("Christopher", "Nolan", 1970)
  val someBody = new Director("Just", "Some Body", 1990)

  val f = new Film("Die Hard", 1988, 8.3, mcTiernan)
  val f2 = f.copy(name = "Die Harder", yearOfRelease = 1990)

  println(f2.name)
  val memento = new Film("Memento", 2000, 8.5, nolan)
  val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
  val inception = new Film("Inception", 2010, 8.8, nolan)
  val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7,eastwood)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9,eastwood)
  val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
  val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
  val invictus = new Film("Invictus", 2009, 7.4, eastwood)
  val predator = new Film("Predator", 1987, 7.9, mcTiernan)
  val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
  val huntForRedOctober = new Film("The Hunt for Red October", 1990,7.6, mcTiernan)
  val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8,mcTiernan)

  eastwood.yearOfBirth
  dieHard.director.name
  invictus.isDirectedBy(nolan)
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Double): Director = new Director(firstName, lastName, yearOfBirth)

  def older(firstDirector: Director, SecondDirector: Director): Director = {
    if (firstDirector.yearOfBirth > SecondDirector.yearOfBirth) {
      firstDirector
    } else SecondDirector
  }
}

object Film {
  def apply(name: String, yearOfRelease: Double, imdbRating: Double, director: Director): Film = new Film(name, yearOfRelease, imdbRating, director)

  def highestRating(firstFilm: Film, secondFilm: Film): Double = {
    if (firstFilm.imdbRating > secondFilm.imdbRating) firstFilm.imdbRating
    else secondFilm.imdbRating
  }
}