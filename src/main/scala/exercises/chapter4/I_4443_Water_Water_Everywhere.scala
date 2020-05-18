package exercises.chapter4

class I_Water_Water_Everywhere {
  /*
  Book: Essential Scala Chapter 4
  Exercise 4.4.4.3 Water, Water, Everywhere
  Bottled water has a size (an Int ), a source
  (which is a well, spring, or tap), and
  a Boolean carbonated. Implement this in Scala.
*/
}


// Sum Type
sealed trait Source
case object  Well extends Source
case object Spring extends Source
case  object Tap extends Source

//The Product Type Polymorphism Pattern
// Why we use final? When we don't want any another class to extend this class
//final case class BottledWater(size:Int,source: Source, carbonated:Boolean)


// case class can't extend another case class
trait BottledWater {
  def size:Int
  def source: Source
  def carbonated:Boolean
}

case class BottledWater2(size:Int,source: Source, carbonated:Boolean)

//final case class BottledWater2(size:Int,source: Source, carbonated:Boolean)
// When final you can't extend the case class

class CocaCola(override val size:Int,
               override val source: Source,
               override val carbonated:Boolean,
               label:String) extends BottledWater2(size,source,carbonated)

//val smallCocacola = new CocaCola(2,Well,true, "smallCocaCOla")