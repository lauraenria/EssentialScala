package exercises.chapter2
import org.scalatest.flatspec.AnyFlatSpec

// you'd usually directly extend a base class defined for your project

/*
   Using the Scala console or worksheet, determine the type and value of the following expressions:
   1 + 2
   "3".toInt
   "foo".toInt
 */

class s_2141_Type_and_ValueTest extends AnyFlatSpec {
  "The function" should "return the sum of the numbers" in {
    // test
    assert(Type_and_Value.addition(2, 4) === 6)
  }

  "The function" should "return an int" in {
    assert(Type_and_Value.returnANumber("6") === 6)
//    == eq method which checks if the two references point to the same object.
//    === equalTo
  }
}
