package _0009_infinite_while_loop

object MainObject {
  def main(args: Array[String]): Unit = {
    var a = 10 // Initialization
    while (true) { // Condition
      println(a)
      a = a + 2 // Incrementation
    }
  }
}  