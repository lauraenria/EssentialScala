package exercises.chapter2

class s_2141_Type_and_Value_Description {
  /*
   Using the Scala console or worksheet, determine the type and value of the following expressions:
   1 + 2
   "3".toInt
   "foo".toInt
 */
}

object Type_and_Value {
  def addition(firstNumber: Int, secondNumber: Int): Int = {
    firstNumber + secondNumber
  }
  def returnANumber(str: String): Int = {
    str.toInt
  }
}
