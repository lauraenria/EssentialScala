package exercises.chapter3
/*
Book: Essential Scala Chapter 3
Exercise 3.1.6.2 Cats on the Prowl

Define an object ChipShop with a method willServe .
This method should accept a Cat and return true if
the cat’s favourite food is chips, and false
otherwise.
*/
class B_Cats_on_the_Prowl

object ChipShop {
  def willServe(cat: Cat): Boolean =
    if(cat.food == "Chips")
      true
    else
      false
}

object B_Cats_on_the_Prowl extends App {

}
