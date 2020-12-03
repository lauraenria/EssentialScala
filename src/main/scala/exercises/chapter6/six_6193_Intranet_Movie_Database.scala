package exercises.chapter6

class six_6193_Intranet_Movie_Database {
  /*
  Using this sample code, write implementations of the following methods:
  • Accept a parameter numberOfFilms of type Int — find all directors who
  have directed more than numberOfFilms
  •Accept a parameter year of type Int —find a director who was born
  before that year
  • Accept two parameters, year and numberOfFilms , and return a list
  of directors who were born before year who have also directed more
  than than numberOfFilms
  • Accept a parameter ascending of type Boolean that defaults to true.
  Sort the directors by age in the specified order
 */
}
/*

case class Film(name: String, yearOfRelease: Int, imdbRating: Double)
case class Director(firstName: String,
                    lastName: String,
                    yearOfBirth: Int,
                    films: Seq[Film])

object Film extends App {

  val memento = new Film("Memento", 2000, 8.5)
  val darkKnight = new Film("Dark Knight", 2008, 9.0)
  val inception = new Film("Inception", 2010, 8.8)
  val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9)
  val unforgiven = new Film("Unforgiven", 1992, 8.3)
  val granTorino = new Film("Gran Torino", 2008, 8.2)
  val invictus = new Film("Invictus", 2009, 7.4)
  val predator = new Film("Predator", 1987, 7.9)
  val dieHard = new Film("Die Hard", 1988, 8.3)
  val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6)
  val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8)
  val eastwood = new Director(
    "Clint",
    "Eastwood",
    1930,
    Seq(highPlainsDrifter, outlawJoseyWales, unforgiven, granTorino, invictus)
  )
  val mcTiernan = new Director(
    "John",
    "McTiernan",
    1951,
    Seq(predator, dieHard, huntForRedOctober, thomasCrownAffair)
  )
  val nolan = new Director(
    "Christopher",
    "Nolan",
    1970,
    Seq(memento, darkKnight, inception)
  )
  val someGuy = new Director("Just", "Some Guy", 1990, Seq())
  val directors = Seq(eastwood, mcTiernan, nolan, someGuy)

  def directorsWhoHasMoreFilms(numberOfFilms: Int): Seq[Director] = {
    directors.filter(_.films.length > numberOfFilms)
  }

  def directorsWhoBornBeforeThisYear(year: Int): Option[Director] = {
    //    directors.filter(_.yearOfBirth < year)
    directors.find(_.yearOfBirth == year)
  }

  def directorsWhoBornBeforeThisYearAndWhoHasMoreFilms(
    numberOfFilms: Int,
    year: Int
  ): Seq[Director] = {

    //    val seqFilm = directorsWhoHasMoreFilms(numberOfFilms)
    //    val seqYear = directorsWhoBornBeforeThisYear(year)
    //    seqFilm ++ seqYear
    val byAge = directors.filter(_.yearOfBirth < year)
    val byFilm = directors.filter(_.films.length > numberOfFilms)
    byAge.filter(byFilm.contains)
  }

  //  def sortDirectorsByAge(ascending: Boolean = true): Seq[Director] = {
  //    if (ascending) {
  //      directors.sortBy(_.yearOfBirth)
  //    } else directors.sortBy(_.yearOfBirth)
  //  }

  def sortDirectorsByAge(ascending: Boolean = true): Seq[Director] = {
    if (ascending) {
      directors.sortWith((a, b) => a.yearOfBirth > b.yearOfBirth)
    } else directors.sortWith((a, b) => b.yearOfBirth > a.yearOfBirth)
  }

  directorsWhoHasMoreFilms(2)
  directorsWhoBornBeforeThisYear(1970)
  directorsWhoBornBeforeThisYearAndWhoHasMoreFilms(2, 1970)

  //  println(directorsWhoBornBeforeThisYear(1970))
  //  println(directorsWhoBornBeforeThisYearAndWhoHasMoreFilms(2, 1970))
  println(sortDirectorsByAge())
}
 */
