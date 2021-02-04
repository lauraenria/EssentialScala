package exercises.scalaTest
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.tagobjects.Slow

//the error messages generated for == and === comparisons don't distinguish between actual and expected values.

class learnScalaTest_Test extends AnyFlatSpec {
  "The function" should "return the sum of the number" in {
    assert(LearnScalaTestClass.addiction(2, 4) === 6)
  }

  ignore should "fail if 12" in {
    fail("I've got a bad feeling about this")
  }
  //  it should "cancel the test because" in {
  //    cancel("Can't run the test because no internet connection was found")
  //  }

  it should "be tagged with" taggedAs (Slow) in {
    assert(LearnScalaTestClass.addiction(1, 1) === 2)
  }

  //  ScalaTest allows you to define arbitrary test categories,
  //  to "tag" tests as belonging to those categories, and filter tests to run based on their tags.

  ignore should "cancel the test because" in {
    cancel("Can't run the test because no internet connection was found")
  }

  "The string" should "return an int" in {
    assert(LearnScalaTestClass.returnANumber("6") === 6)
  }

  "In the List" should "contain the number 4" in {
    assert(LearnScalaTestClass.list.exists(_ == 4))
  }
  it should "not be greater than 10" in {
    assert(LearnScalaTestClass.list.exists(i => i < 10))
  }
  // To use assertResult, you place the expected value in parentheses after assertResult
  "The addiction of the variable a and b" should "should be 7" in {
    val a = 5
    val b = 2
    assertResult(7) {
      a + b
    }
  }
}
