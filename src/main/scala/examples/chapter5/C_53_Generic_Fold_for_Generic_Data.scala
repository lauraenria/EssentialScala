package examples.chapter5

class C_53_Generic_Fold_for_Generic_Data {
  /*
    instance slightly modified to use the invariant sum type pattern.
    higher-order methods: functions and methods that accept functions
 */
}

sealed trait LinkedList[A] {
  //The last version of fold that we saw on IntList was

  /* this doesn't compile

  def fold[A](end: A, f: (Int, A) => A): A =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }

   */

  def fold1[B](end: B, f: (A, B) => B): B =
    this match {
      case End()        => end
      case Pair(hd, tl) => f(hd, tl.fold1(end, f))
    }

  def fold[B](end: () => B, pair: (A, B) => B): B =
    this match {
      case End()        => ??? // () => B
      case Pair(hd, tl) => ??? // (A, B) => B .
    }
  /*
   fold(0){ (total, elt) => total + elt }
   def fold[B](end: B, pair: (A, B) => B): B
   def fold[B](end: B)(pair: (A, B) => B): B
 */
}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]
final case class End[A]() extends LinkedList[A]

/*
  placeholder syntax:

  ((_: Int) * 2) === (a: Int) => a * 2
  //res0: Int => Int = $$Lambda$1033/287859212@6bf13698
  // res: Int => Int = <function1>

  _ + _     // expands to `(a, b) => a + b`
  foo(_)    // expands to `(a) => foo(a)`
  foo(_, b) // expands to `(a) => foo(a, b)`
  _(foo)    // expands to `(a) => a(foo)`

 */

object Sum {
  def sum(x: Int, y: Int) = x + y

  Sum.sum(2, 5)
  (Sum.sum _)
  // res1: (Int, Int) => Int = <function2>
}

object MathStuff {
  def add1(num: Int) = num + 1

  // Counter(2).adjust(MathStuff.add1) ???
  // res2: Counter = Counter(3)

  def example(x: Int)(y: Int) = x + y // Why?
  // example: (x: Int)(y: Int)Int
  example(1)(2)
  // res3: Int = 3
}
