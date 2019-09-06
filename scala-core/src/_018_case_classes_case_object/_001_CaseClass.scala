package _018_case_classes_case_object

// Scala case classes are just regular classes which are immutable by default
// and decomposable through pattern matching.
case class MyCaseClass(a: Int, b: Int)

object _001_CaseClass {
  def main(args: Array[String]) {
    var result = MyCaseClass(2, 5) // Creating object of case class
    println("a = " + result.a) // Accessing elements of case class
    println("b = " + result.b)
  }
}