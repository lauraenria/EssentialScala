package examples.chapter5

class D_54_Modelling_Data_with_Generic_Types {
  /*
    generic types we can implement generic sum and product types,
    and optional values.
 */
}

/*generics to model a product type.*/

object D_5_4_1_Generic_Product_Types {
  def intAndString_0: IntAndString_0 = ???
  def booleanAndDouble_0: BooleanAndDouble_0 = ???

  case class IntAndString_0(intValue: Int, StringValue: String)
  case class BooleanAndDouble_0(booleanValue: Boolean, doubleValue: Double)

  case class Pair[A, B]() // ???

  // using use generics to create a product type

  def intAndString_1: Pair[Int, String] = ???
  def booleanAndDouble_1: Pair[Boolean, Double] = ???
}

/*
    Generics provide an approach to defining product types that
    relies on aggregation
 */
