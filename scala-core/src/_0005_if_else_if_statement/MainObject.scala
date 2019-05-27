package _0005_if_else_if_statement

object MainObject {
  def main(args: Array[String]): Unit = {

    var myNumber: Int = 85
    if (myNumber >= 0 && myNumber < 50) {
      println("F")
    } else if (myNumber >= 50 && myNumber < 60) {
      println("E")
    } else if (myNumber >= 60 && myNumber < 70) {
      println("D")
    } else if (myNumber >= 70 && myNumber < 80) {
      println("C")
    } else if (myNumber >= 80 && myNumber < 90) {
      println("B")
    } else if (myNumber >= 90 && myNumber <= 100) {
      println("A")
    } else println("Invalid")

  }
}  