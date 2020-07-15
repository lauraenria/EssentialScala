package exercises.chapter4

class N_4632_The_Forest_of_Trees {
  /* A binary tree of integers can be defined as follows:
     A Tree is a Node with a left and right Tree or a Leaf with an element of type Int.
     Implement this algebraic data type.

     Algebraic Data Types (ADTs for short) are a way of structuring data.
     There are two basic categories of ADTs:
     product types
     sum types


     Trees: Unlike Arrays, Linked Lists, Stack and queues,
     which are linear data structures, trees are hierarchical data structures.

     https://www.geeksforgeeks.org/binary-tree-set-1-introduction/

     Tree Vocabulary: The topmost node is called root of the tree.
     The elements that are directly under an element are called its children.
     The element directly above something is called its parent.
     For example, ‘a’ is a child of ‘f’, and ‘f’ is the parent of ‘a’.
     Finally, elements with no children are called leaves.


     An algebraic data type is any data that uses the patterns known as a product type, or sum type.

     Sum Type Pattern:
     sealed trait A
     final case class B() extends A
     final case class C() extends A
 */
}


//sealed trait Tree
//
//final case class Node (left: Tree, right: Tree) extends Tree
//
//final case class Leaf(leaf:Int)


// Product Type case class A(b: B, c: C)

//sealed trait Left {
//}
//sealed trait Right {
//}
//sealed trait Leaf {
//  def leaf: Int
//}
//
//case class Node (left: Left, right: Right, leaf: Leaf)



























