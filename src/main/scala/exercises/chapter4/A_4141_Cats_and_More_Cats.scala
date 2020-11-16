package exercises.chapter4

class A_4141_Cats_and_More_Cats {
/*
  Book: Essential Scala Chapter 4
  Exercise 4.1.4.1 Cats, and More Cats
  Demand for Cat Simulator 1.0 is exploding!
  For v2 we’re going to go beyond
  the domes c cat to model Tiger s,
  Lions, and Panthers in addition to the Cat.
  Define a trait Feline and then define
  all the different species as subtypes of Feline.
*/
}

trait Feline {
  def color: String
  def sound: String = this match {
    case _ :Cat => "Meow"
    case _ => "Roar"
  }
}

case class Cat(color:String, favouritefood:String) extends Feline
case class Lion(color:String, maneSize:Int) extends Feline



object Basket extends App {
  val myCat = Cat("orange", "milk")
  println(myCat)
}