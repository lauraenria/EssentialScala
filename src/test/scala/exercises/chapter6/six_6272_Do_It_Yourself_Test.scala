package exercises.chapter6

import exercises.chapter6.Reverse
import org.scalatest.flatspec.AnyFlatSpec

//the error messages generated for == and === comparisons don't distinguish between actual and expected values.

class MinusTest extends AnyFlatSpec {
  val seq: Seq[Int] = Seq(1, 2, 4, 3, 4, 5)
  "The function" should "return the minimum number of the sequence" in {
    assert(GetSmallestValue.minimum1(seq) === 1)
    assert(GetSmallestValue.minimum2(seq) === 1)
    assert(GetSmallestValue.minimum3(seq) === 1)
    assert(GetSmallestValue.minimum4(seq) === 1)
    assert(GetSmallestValue.minimum5(seq) === 1)
  }
}

class ReverseTest extends AnyFlatSpec {
  val seq: Seq[Int] = Seq(1, 2, 4, 3, 4, 5)
  val list: List[Int] = List(1, 2, 4, 3, 4, 5)


  "The function" should "create a sequence containing each number only once" in {

  }

  "The function" should "reverses the elements of a sequence" in {
    assert(Reverse.reverseSeq1(seq) == Seq(5, 4, 3, 4, 2, 1))
    assert(Reverse.reverseList1(list) == List(5, 4, 3, 4, 2, 1))
    assert(Reverse.reverseSeq2(seq) == Seq(5, 4, 3, 4, 2, 1))
    assert(Reverse.reverseList2(list) == List(5, 4, 3, 4, 2, 1))
  }


  //
  //  "The function" should "be an implementation of map in terms of foldRight" in {
  //
  //  }
  //
  //  "The function" should "be the implementation of foldLeft that uses foreach and mutable state" in {
  //
  //  }
}
