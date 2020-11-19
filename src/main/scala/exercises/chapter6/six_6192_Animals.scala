package exercises.chapter6

class six_6192_Animals {
  /*
    • Create a Seq containing the String s "cat" , "dog" , and "penguin".
      Bind it to the name animals.
    • Append the element "tyrannosaurus" to animals
      and prepend the element "mouse".
    • What happens if you prepend the Int 2 to animals ? Why? Try it out... were
      you correct?

      prepend = add (something) to the beginning of something else.
      append = add (something) to the end of a written document.
 */
}

object six_6192_Animals extends App {
  val animals: Seq[String] = List("cat", "dog", "penguin")
  val tyra: String = "tyrannosaurus"
  val mouse: String = "mouse"
  //  prepend
  animals ++: List(mouse) //  returns List[String] = List(cat, dog, penguin, mouse)

  animals +: List(mouse) // returns List[Object] = List(List(cat, dog, penguin), mouse)

  animals +: mouse // returns Vector(List(cat, dog, penguin), m, o, u, s, e)
  animals ++: mouse // returns Vector(cat, dog, penguin, m, o, u, s, e)
  mouse +: animals // return Seq[String] = List(mouse, cat, dog, penguin)

  // append
  animals :+ tyra //  returns Seq[String] = List(cat, dog, penguin, tyrannosaurus)
  animals ++ "tyrannosaurus"
  // returns Seq[Any] = List(cat, dog, penguin, t, y, r, a, n, n, o, s, a, u, r, u, s

  animals ++: List(1) // returns List[Any] = List(cat, dog, penguin, 1)

  animals ++: List(1) //  returns List[Any] = List(cat, dog, penguin, 1)
  2 +: animals // returns Seq[Any] = List(2, cat, dog, penguin)

  mouse +: animals :+ tyra // returns List(mouse, cat, dog, penguin, tyrannosaurus)

}
