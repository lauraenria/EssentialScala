package exercises.chapter6

class six_6271_Heroes_Of_The_Silver_Screen {
  /*
  1. What is the type of the data we have available? Seq[Film], List[]Director]
  2. What is the type of the result we want? List[String], List[String]
  3. What is the type of the operations we will use?

  These exercises re-use the example code from the Intranet Movie Database

  * Nolan Films
  Starting with the definition of nolan, create a list containing the names of the
  films directed by Christopher Nolan.

  * Cinephile
  Starting with the definition of directors , create a list containing the names
    of all films by all directors.

   * Vintage McTiernan
  Starting with mcTiernan, find the date of the earliest McTiernan film.

  * High Score Table
  Starting with directors , find all films sorted by descending IMDB rating
  Starting with directors again, find the average score across all films

  Tonight’s Listings
  Star ng with directors , print the following for every film: "Tonight only!
  FILM NAME by DIRECTOR!"
  From the Archives starting with directors again, find the earliest film by any director:
   */
}


case class Film(name: String, yearOfRelease: Int, imdbRating: Double)

case class Director(firstName: String,
                    lastName: String,
                    yearOfBirth: Int,
                    films: Seq[Film])

object DirectorsAndFilms extends App {

  val memento: Film = Film("Memento", 2000, 8.5)
  val darkKnight: Film = Film("Dark Knight", 2008, 9.0)
  val inception: Film = Film("Inception", 2010, 8.8)
  val highPlainsDrifter: Film = Film("High Plains Drifter", 1973, 7.7)
  val outlawJoseyWales: Film = Film("The Outlaw Josey Wales", 1976, 7.9)
  val unforgiven: Film = Film("Unforgiven", 1992, 8.3)
  val granTorino: Film = Film("Gran Torino", 2008, 8.2)
  val invictus: Film = Film("Invictus", 2009, 7.4)
  val predator: Film = Film("Predator", 1987, 7.9)
  val dieHard = Film("Die Hard", 1988, 8.3)
  val huntForRedOctober: Film = Film("The Hunt for Red October", 1990, 7.6)
  val thomasCrownAffair: Film = Film("The Thomas Crown Affair", 1999, 6.8)

  val films = List(memento, darkKnight, inception, highPlainsDrifter, outlawJoseyWales, unforgiven, granTorino, invictus, predator, dieHard, huntForRedOctober, thomasCrownAffair)
  val eastwood: Director = Director(
    "Clint",
    "Eastwood",
    1930,
    Seq(highPlainsDrifter, outlawJoseyWales, unforgiven, granTorino, invictus)
  )
  val mcTiernan: Director = Director(
    "John",
    "McTiernan",
    1951,
    Seq(predator, dieHard, huntForRedOctober, thomasCrownAffair)
  )
  val nolan: Director = Director(
    "Christopher",
    "Nolan",
    1970,
    Seq(memento, darkKnight, inception)
  )

  val directors: Seq[Director] = Seq(eastwood, mcTiernan, nolan)

  val NolanFilmsFlatMap: Seq[String] = nolan.films.flatMap(f => List(f.name))
  val NolanFilmsMap: Seq[String] = nolan.films.map(_.name)
  val Cinephile: Seq[String] = directors.flatMap(d => d.films.map(_.name))
  val Cinephile2: Seq[String] = directors.flatMap(director => director.films.map(film => film.name))
  val vintageMcTiernan: Int = mcTiernan.films.map(_.yearOfRelease).min
  val highScoreTableSortedOne: Seq[Double] = directors.flatMap(d => d.films.map(_.imdbRating).sorted)
  val highScoreTableSortedTwo: Seq[Film] = directors.
    flatMap(director => director.films).
    sortWith((a, b) => a.imdbRating > b.imdbRating)
  val listCompleteFilms: Seq[Film] = directors.flatMap(director => director.films)
//  def foldLeft[B](z: B)(op: (B, A) ⇒ B): B
    val filmsAverageHighScoreTable: Double = listCompleteFilms.foldLeft(0.0)((sum, film) => (sum + film.imdbRating) / films.length)
//  foreach Seq[A] A => Unit
  val tonightListings: Unit = directors.foreach(director => director.films.foreach(
    film => println(s"Tonight only! ${film.name} by ${director.firstName} ${director.lastName} !") ))

  val fromArchives: Option[Film] = directors.flatMap(director => director.films).sortWith((a, b) => a.yearOfRelease < b.yearOfRelease ).headOption
  println(NolanFilmsFlatMap)
  println(NolanFilmsMap)
  println(Cinephile)
  println(vintageMcTiernan)
  println(highScoreTableSortedOne)
  println(highScoreTableSortedTwo)
}