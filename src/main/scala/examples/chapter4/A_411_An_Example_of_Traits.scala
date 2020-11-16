package examples.chapter4
import java.util.Date

class A_411_An_Example_of_Traits {}

trait Visitor {
  def id: String
  // Unique id assigned to each user
  def createdAt: Date // Date this user first visited the site
  // How long has this visitor been around?
  def age: Long = new Date().getTime - createdAt.getTime
}

case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor {
  def older(v1: Visitor, v2: Visitor): Boolean = {
    v1.createdAt.before(v2.createdAt)
  }
}

case class User(id: String, email: String, createdAt: Date = new Date())
    extends Visitor

object A_411_An_Example_of_Traits_Test extends App {

//  val laura:Visitor("hello",

}
