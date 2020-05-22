package exercises.chapter4

class L_4563_Email {
  /*
  Recall the Visitor trait we looked at earlier: a website Visitor is either
  Anonymous or a signed-in User . Now imagine we wanted to add the ability
  to send emails to visitors. We can only email signed-in users, and sending an
  email requires a lot of knowledge about SMTP settings, MIME headers, and
  so on. Would an email method be be er implemented using polymorphism
  on the Visitor trait or using pattern matching in an EmailService object?
  Why?
   */
}

/*
the methods give the same result: a method
defined on the classes of interest. We should use whichever is more convenient.
This normally ends up being pa ern matching on the base trait as it
requires less code duplication.
 */


sealed trait Visitor { /* ... */ }
final case class User(/* ... */) extends Visitor
final case class Anonymous(/* ... */) extends Visitor

object EmailService {
  def chekAuthentication(visitor:Visitor):Boolean = {
    visitor match {
      case User() => true
      case Anonymous() => false
    }
  }
}