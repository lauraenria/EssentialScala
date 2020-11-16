package exercises.chapter5

class E_5341_Tree_Pattern_Matching {
  /*
    Algebraic Data Type (ADTs for short): “A type defined by providing several alternatives,
    each of which comes with its own constructor.
    It usually comes with a way to decompose the type through pattern matching.
    The concept is found in specification languages and functional programming languages.
    Algebraic data types can be emulated in Scala with case classes.”

    Product Type Pattern
    If A has a b (with type B ) and a c (with type C ) write

    case class A(b: B, c: C) or

    trait A {
      def b: B
      def c: C
    }

    If A is a B or C write

    sealed trait A
    final case class B() extends A
    final case class C() extends A

    sealed trait LinkedList[A] {
      def fold[B](end: B, f: (A, B) => B): B =
        this match {
          case End() => end
          case Pair(hd, tl) => f(hd, tl.fold(end, f))
        }
     }

    final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
    final case class End[A]() extends LinkedList[A]

    A binary tree can be defined as follows:
    A Tree of type A is a Node with a left and right Tree or a Leaf with an element of type A .
    Implement this algebraic data type along with a fold method.

    Using fold convert the following Tree to a String
 */
}
// Pattern Matching version

/*
sealed trait Tree[A] {
  def fold[B](node: (B, B) => B, leaf: A => B): B = {
    this match {
      case Leaf(value) => leaf(value)
      case Node(left, right) =>
        node(left.fold(node, leaf), right.fold(node, leaf))
    }
  }
}

final case class Node[A](left: Tree[A], right: Tree[A]) extends Tree[A]
final case class Leaf[A](value: A) extends Tree[A]

object E_5341_Tree_Pattern_Matching extends App {
  val tree = Node(Leaf[String]("2"), Leaf[String]("3"))
  val leaf = Leaf[String]("10")

  val tree2: Tree[String] =
    Node(
      Node(Leaf("To"), Leaf("iterate")),
      Node(
        Node(Leaf("is"), Leaf("human,")),
        Node(Leaf("to"), Node(Leaf("recurse"), Leaf("divine")))
      )
    )

  tree.fold[String]((A, B) => A + "" + B, str => str)
}
 */
