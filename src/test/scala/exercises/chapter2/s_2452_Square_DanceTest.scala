package exercises.chapter2
import org.scalatest.flatspec.AnyFlatSpec

class s_2452_Square_DanceTest extends AnyFlatSpec {
  "The function square" should "return the double of the number" in {
    assert(Dance.square(3) === 9)
    assert(Dance.cube(3) === 27)
  }
}
