package _018_case_classes_case_object


trait SuperTrait

case class MyCaseClass1(a: Int, b: Int) extends SuperTrait

case class MyCaseClass2(a: Int) extends SuperTrait // Case class

// A case class which has no arguments is declared as case object instead of case class.
// case object is serializeable by default.
case object MyCaseObject extends SuperTrait // Case object


object _002_CaseClassPatternMatching {

  def main(args: Array[String]) {
    callCase(MyCaseClass1(1, 55))
    callCase(MyCaseClass2(2))
    callCase(MyCaseObject)
  }

  def callCase(x: SuperTrait) = x match {
    case MyCaseClass1(x, y) => println("a = " + x + " b =" + y)
    case MyCaseClass2(x) => println("a = " + x)
    case MyCaseObject => println("No Argument")
  }

}