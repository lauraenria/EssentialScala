package exercises.chapter6

class Six_6272_Do_It_Yourself {
  /*
   * Minimum
        Write a method to find the smallest element of a Seq[Int]

   * Unique
        Given Seq(1, 1, 2, 4, 3, 4) create the sequence containing each
        number only once. Order is not important, so Seq(1, 2, 4, 3) or
        Seq(4, 3, 2, 1) are equally valid answers. Hint:
        Use contains to check if a sequence contains a value.

   * Reverse
        Write a function that reverses the elements of a sequence.
        Your output does not have to use the same concrete implementation
        as the input. Hint: use foldLeft.

   * Map
        Write map in terms of foldRight.

   * Fold Left
        Write your own implementation of foldLeft that uses foreach and
        mutable state. Remember you can create a mutable variable using
        the var keyword, and assign a new value using =.
        For example
        var mutable = 1
        // mutable: Int = 1
        mutable = 2
        // mutable: Int = 2
   */
}

object GetSmallestValue extends App {

  val seq: Seq[Int] = Seq(1, 1, 2, 4, 3, 4)

  def minimum1(seq: Seq[Int]): Int = seq.min

  def minimum2(seq: Seq[Int]): Int = seq.sorted.head

  def minimum3(seq: Seq[Int]): Int = seq.sortWith(_ < _).head

  def minimum4(seq: Seq[Int]): Int = seq.foldLeft(Int.MaxValue)(math.min)

  def minimum5(seq: Seq[Int]): Int = seq.reduceLeft(_ min _)

  /* http://alvinalexander.com/scala/scala-reduceleft-examples/
  def foldLeft[B](z: B)(op: (B, A) => B): B
  B => the result type of the binary operator.
  z => the start value.
 op => the binary operator

   */
  //  List(1, 3, 8).foldLeft(100)(_ - _) == ((100 - 1) - 3) - 8 == 88
  //  List(1, 3, 8).foldRight(100)(_ - _) == 1 - (3 - (8 - 100)) == -94

  //  def reduceLeft[B >: A](op: (B, A) ⇒ B): B
  /*
    foldLeft:

   * initial value has to be passed

    reduceLeft:

   * takes first element of the collection as initial value
   * throws exception if collection is empty

    Here is the signature of foldLeft (could also have been foldRight for the point I'm going to make):

def foldLeft [B] (z: B)(f: (B, A) => B): B
And here is the signature of reduceLeft (again the direction doesn't matter here)

def reduceLeft [B >: A] (f: (B, A) => B): B
These two look very similar and thus caused the confusion.
reduceLeft is a special case of foldLeft
(which by the way means that you sometimes can express the same thing by using either of them).

When you call reduceLeft say on a List[Int]
it will literally reduce the whole list of integers into a single value,
which is going to be of type Int (or a supertype of Int, hence [B >: A]).

When you call foldLeft say on a List[Int] it will fold the whole list
(imagine rolling a piece of paper) into a single value,
but this value doesn't have to be even related to Int (hence [B]).

    Steps
    1. check if empty
    2. order the seq
    3. return min
   */
}

object Unique extends App {
  val  sequence = Seq(1, 1, 2, 4, 3, 4)

  //  def contains[A1 >: A](elem: A1): Boolean
  //  Tests whether this sequence contains a given value as an element.
  def uniqueSeq1(seq: Seq[Int]): Seq[Int] = {
    var newSeq: Seq[Int] = Seq.empty
    for (number <- seq) {
      if (!newSeq.contains(number)) {
        println(newSeq, Seq(number))
        newSeq = newSeq :+ number
      }
    }
    newSeq
  }

//  a sequence of unique numbers from the original sequence
//  a sequence of result numbers from the previous el of the seq
  def uniqueSequence[A](sequence: Seq[A]): Seq[A] = { sequence.foldLeft(Seq.empty[A])((seq, el) => if(!seq.contains(el)) {seq :+ el} else seq)}

}

object Reverse extends App {
  /*

  In Scala, List has an operator ::,
  which is known as the Cons operator.
  It is useful to add new elements at the beginning of the List.
  Here, Cons is short for construct the new List object.
   */

  val seq: Seq[Int] = Seq(1, 1, 2, 3, 4, 5)

  //  This method does not reverse the list in place, but returns a new list.
  def reverseSeq1(seq: Seq[Int]): Seq[Int] =
    

  //  :: method, which is equivalent to +:
  //  the ::: method is a right-associative List -specific version of ++ :
  def reverseList1[A](l: List[A]): List[A] = {
    def _reverse(res: List[A], rem: List[A]): List[A] = rem match {
      case Nil => res
      case h :: tail => _reverse(h :: res, tail)
    }

    _reverse(Nil, l)
  }


  def reverseSeq2[A](seq: Seq[A]): Seq[A] = {
    //(seq[A],A) => Seq[A]
    seq.foldLeft(Seq.empty[A])((seq, el) => el +: seq)
  }

  def reverseList2[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()) { (acc, number) => number :: acc }

}

