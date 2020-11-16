package exercises.chapter5

class M_5542_Mapping_Maybe {
  /*
    Implement map for Maybe.
    For bonus points, implement map in terms of flatMap .

    sealed trait LinkedList[A] {
    def map[B](fn: A => B): LinkedList[B] = this match {
    case Pair(head, tail) => Pair(fn(head), tail.map(fn))
    case End()            => End[B]()
  }
}

    def flatMap[B](fn: A => Maybe[B]): Maybe[B] = {
    this match {
      case Full(v) => fn(v)
      case Empty() => Empty[B]()
    }
  }

 */
}
/*
trait Maybe[A] {
  def map[B](fn: A => B): Maybe[B] = {
    this match {
      case Full(value) => Full(fn(value))
      case Empty()     => Empty[B]()
    }
  }

  def flatMap[B](fn: A => Maybe[B]): Maybe[B] = {
    this match {
      case Full(v) => fn(v)
      case Empty() => Empty[B]()
    }
  }
}

final case class Full[A](value: A) extends Maybe[A]
final case class Empty[A]() extends Maybe[A]

object M_5542_Mapping_Maybe extends App {

  val list1: List[Int] = List(1, 2, 3)
  val list2: List[Maybe[Int]] = List(Full(3), Full(2), Full(1))

  println(list2.flatMap(x => List(x.map(y => y + 10))))

  println(list1.map[String](x => s"start to count! ${x}..."))
}
 */
