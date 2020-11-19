package exercises.chapter6

class six_6191_Documentation {
  /*
  Look up the Seq and List types now and answer the following:
  -------------------------------------------------------------------
  • There is a synonym of length defined on Seq — what is it called?  SIZE
  -------------------------------------------------------------------
  • There are two methods for retrieving the first item in a List –
    what are they called and how do they differ?

    1) By using the index value (0) of the first element eg. list(0)
    2) By using the list.head method eg. list.head
    ps. throwing an exception if the list is empty

    ------------------------------------------------------------------
  • What method can be used to display the elements
    of the sequence as a string?
    -------------------------------------------------------------------
  • What method of Option can be used to determine
    whether the option contains a value?
    isDefined — True if not empty
    isEmpty — True if empty
    nonEmpty — True if not empty
    contains — Checks if value equals optional value, or false if empty
    --------------------------------------------------------------------
  Tip: There is a link to the Scala API documentation at http://scala-lang.org.
 */
}

object six_6191_Documentation extends App {
  val l = List(7, 8, 9)
  println(l.headOption) // returns Option[Int] = Some(7)
  println(l.head)
//  l(0)

  val seq: Seq[Int] = Seq(1, 2, 3)
  println(seq.mkString(",")) // returns "1,2,3"
  println(seq.mkString("[ ", ", ", " ]")) // returns "[ 1, 2, 3 ]"

  val option = Some(4, 5, 6)
  val none = None
  println(option.isDefined, option.isEmpty)
  println(none.isDefined, none.isEmpty)

}
