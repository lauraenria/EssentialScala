import org.scalatest.flatspec.AnyFlatSpec

/*
The FlatSpec style
A good first step for teams wishing to move from xUnit to BDD,
the FlatSpec style's structure is flat like xUnit, so simple and familiar,
but the test names must be written in a specification style: "X should Y," "A must B," etc.

To select just the FlatSpec style in an sbt build, include this line:

libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test"


 def checkSingleDataFetcher(id: String, expectedResource: Option[SpineResource]): Future[Assertion] = {}
 .map(resource => assert(resource === expectedResource))
 .map(resource => { assert(resource.equals(None).equals(!expectedRetrievedStatus))})
 class ConcreteSpineClientSpec extends AsyncFlatSpec
 extends AnyFlatSpec with should.Matchers with TestHelper
 def testEquality[A, B](a: A, b: B): Any = a should be(b)
 def testDisequality[A, B](a: A, b: B): Any = a should not be b
 */

class SetSpec extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}
