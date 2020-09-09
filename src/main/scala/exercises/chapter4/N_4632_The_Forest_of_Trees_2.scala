package exercises.chapter4

class N_4632_The_Forest_of_Trees_2 {
 /*
 Implement sum and double on Tree using
 polymorphism and pattern matching.
  */
}

sealed trait Tree  {
  def sum:Int = this match {
    case Leaf(leaf) => leaf
    case Node (left,right) => left.sum + right.sum
  }
}

case class Node(right: Node, left: Tree) extends Tree
case class Leaf(leaf:Int) extends Tree

