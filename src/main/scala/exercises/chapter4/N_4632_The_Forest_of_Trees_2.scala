package exercises.chapter4

class N_4632_The_Forest_of_Trees_2 {
 /*
 Implement sum and double on Tree using
 polymorphism and pattern matching.
  */
}


sealed trait Tree2  {
  final class Node(right: Tree2, left: Tree2)
  final class Leaf(leaf:Int) extends Tree2
}




