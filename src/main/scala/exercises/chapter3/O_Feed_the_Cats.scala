package exercises.chapter3

class O_Feed_the_Cats {
  /*
Book: Essential Scala Chapter 3
Exercise 3.5.3.1 Feed the Cats
Define an object ChipShop with a method willServe.
This method should accept a Cat and return true
if the cat’s favourite food is chips, and false
otherwise. Use pa ern matching.
*/
}

case class Cat(favouritefood:String)

object typeOfCats extends App {
  val humanCat = Cat("chips")
  val redCat = Cat("fish")
  println(ChipShop.willServe(humanCat))
}
// because match can look inside an object and see
// what is inside before to match it
object ChipShop {
  def willServe(cat:Cat):Boolean = {
    cat match {
      case Cat("chips") => true
      case _ => false
    }
  }
}