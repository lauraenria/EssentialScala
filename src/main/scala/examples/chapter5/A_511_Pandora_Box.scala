package examples.chapter5

class A_511_Pandora_Box {
  /*
    use generics to abstract over types, to create data that works with user specified types.
    use functions to abstract over methods, to reduce duplication in code.
    Generic types allow us to abstract over types.

    A box that stores a single value.
    We don’t care what type is stored in the box, but we want to
    make sure we preserve that type when we get the value out of the box.

    Type Parameter Syntax:
    We declare generic types with a list of type names within square brackets like [A, B, C] .
    By convention we use single uppercase letters for generic types.
    Generic types can be declared in a class or trait declaration

    case class Name[A](...){ ... }
    trait Name[A]{ ... }

    def name[A](...){ ... }

    type parameters
    method parameters
  */
}

final case class Box[A](value:A)
/* The syntax [A] is called a type parameter. */

object BoxTest extends App {
println(Box(2))
println(Box("Hi"))
println(generic[String]("Foo")) // method parameters
println(generic(1))
// when we call generic(1) the name in is bound to the value 1 within the body of generic .

  def generic[A](in:A):A = in /*
We can also add type parameters to methods,
which limits the scope of the parameter to the method declare on and body
*/
}

sealed trait Calculation
final case class Success_1(result: Double) extends Calculation
final case class Failure_2(reason: String) extends Calculation


sealed trait Result[A]
case class Success_3[A](result: A) extends Result[A]
case class Failure_4[A](reason: String) extends Result[A]


/* Invariant Generic Sum Type Pattern
If A of type T is a B or C write  */
sealed trait A[T]
final case class B[T]() extends A[T]
final case class C[T]() extends A[T]