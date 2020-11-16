package exercises.chapter2;
import org.scalatest.flatspec.AnyFlatSpec;

class s_2453_Precise_Square_DanceTest extends AnyFlatSpec {
  "The function square" should "return the double of the number" in {
    assert(calc2.square(3) === 9)
    assert(calc2.square(3) === 9.0)
  }

  it should "" in {}

  "The function cube" should "return the double of the number" in {
    assert(calc2.cube(3) === 8)
    assert(calc2.cube(3) === 27.0)
  }
}
