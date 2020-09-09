package exercises.chapter3
/*
Book: Essential Scala Chapter 3
Exercise 3.1.6.1 Cats, Again pag64

Define a class Cat and then create an object
for each cat in the table above
*/



class Cat(val colour: String, val food: String)

object A_Cats_Again extends App {
  val oswald = new Cat("Black", "Milk")
  val henderson = new Cat("Ginger", "Chips")
  val quentin = new Cat("Tabby and white", "Curry")

  println()
}
