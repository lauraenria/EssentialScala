package exercises.chapter5

class A_5131_Generic_List {
  /*
     Our IntList type was defined as

     sealed trait IntList
     case object End extends IntList
     final case class Pair(head: Int, tail: IntList) extends IntList

    Change the name to LinkedList and make it generic in the type of data stored in the list.
   */
}

/*
  sealed trait LinkedList[A]
  final case class Pair[A](head:A,tail: LinkedList[A]) extends LinkedList[A]
  final case class End[A]() extends LinkedList[A]
 */

