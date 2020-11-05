package examples.chapter5

class J_56_Variance {
  /*
    Variance annotations, which allow us to control subclass relationships
    between types with type parameters.


    sealed trait Maybe[A]
    final case class Full[A](value: A) extends Maybe[A]
    final case class Empty[A]() extends Maybe[A]

  should became

  sealed trait Maybe[A]
  final case class Full[A](value: A) extends Maybe[A]
  case object Empty extends Maybe[???] but Objects can’t have type parameters.

Maybe[Nothing] is not a subtype of Maybe[Int].
To overcome this issue we need to introduce variance annotations.

The variance of a generic type determines how its supertype/subtype relationships change
with respect with its type parameters


A type Foo[T] is invariant in terms of T , meaning that the types Foo[A] and
Foo[B] are unrelated regardless of the relationship between A and B .
This is the default variance of any generic type in Scala.

A type Foo[+T] is covariant in terms of T , meaning that Foo[A] is a supertype
of Foo[B] if A is a supertype of B.

A type Foo[-T] is contravariant in terms of T , meaning that Foo[A] is a subtype
of Foo[B] if A is a supertype of B.
Scala has 23 built-in generic classes for functions of 0 to 22 arguments.

   */

  trait Function0[+R] {
    def apply: R
  }

  trait Function1[-A, +B] {
    def apply(a: A): B
  }

  trait Function2[-A, -B, +C] {
    def apply(a: A, b: B): C
  }

  // and so on...
  /*
Functions are contravariant Foo[-T] in terms of their arguments and covariant Foo[+T] in terms
of their return type. code that expects a Function1[A, B] :
   */
  case class Box[A](value: A) {

    /** Apply `func` to `value`, returning a `Box` of the result. */
    def map[B](func: Function1[A, B]): Box[B] =
      Box(func(value))
  }
  /*
     To understand variance, consider what func ons can we safely pass to this map method:

   • A function from A to B: func basic(A => B)
   • A function from A to a subtype of B
     because it’s result type will have all the proper es of B that we might depend on.
     This indicates that functions are covariant in their result type.


   • A function expecting a supertype of A is also ok, because the A we have
     in the Box will have all the proper es that the func on expects.

   • A function expecting a subtype of A is not ok, because our value may
     in reality be a different subtype of A .
   */

  sealed trait Maybe[+A]
  final case class Full[A](value: A) extends Maybe[A]
  case object Empty extends Maybe[Nothing]

  /*
  Covariant Generic Sum Type Pattern
  If A of type T is a B or C , and C is not generic */
  sealed trait A[+T]
  final case class B[T](t: T) extends A[T]
  case object C extends A[Nothing]
}

trait Food {
  def name: String
}
//Then we can create Meat and Vegetable, that are subclasses of Food.
class Meat(val name: String) extends Food
class Vegetable(val name: String) extends Food
//In the end, we define a WhiteMeat class that is a subclass of Meat.
class WhiteMeat(override val name: String) extends Meat(name)

// Food <= subclass of <== Meat and Vegetable <== WhiteMeat

//food instances of various type.

// Food <- Meat
object InstancesFood {

  val beef = new Meat("beef")
  // Food <- Meat <- WhiteMeat
  val chicken = new WhiteMeat("chicken")
  val turkey = new WhiteMeat("turkey")

  // Food <- Vegetable
  val carrot = new Vegetable("carrot")
  val pumpkin = new Vegetable("pumpkin")
}
//covariant type Recipe
trait Recipe[+A] {
  def name: String
  def ingredients: List[A]
}

case class GenericRecipe(ingredients: List[Food]) extends Recipe[Food] {
  def name: String = s"Generic recipe based on ${ingredients.map(_.name)}"
}

case class MeatRecipe(ingredients: List[Meat]) extends Recipe[Meat] {
  def name: String = s"Meat recipe based on ${ingredients.map(_.name)}"
}

case class WhiteMeatRecipe(ingredients: List[WhiteMeat])
    extends Recipe[WhiteMeat] {
  def name: String = s"Meat recipe based on ${ingredients.map(_.name)}"
}
