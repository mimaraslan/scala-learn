package _011_infinite_while_loop

object MainObject {
  def main(args: Array[String]): Unit = {
    var a = 10 // Initialization
    do {
      println(a)
      a = a + 2 // Increment
    } while (true) // Condition
  }
}  