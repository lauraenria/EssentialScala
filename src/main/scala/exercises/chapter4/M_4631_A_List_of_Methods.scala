package exercises.chapter4

class M_4631_A_List_of_Methods

sealed trait IntList
case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList