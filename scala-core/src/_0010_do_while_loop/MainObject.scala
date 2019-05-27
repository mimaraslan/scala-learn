package _0010_do_while_loop

object MainObject {
  def main(args: Array[String]): Unit = {
    var a = 10 // Initialization
    do {
      println(a)
      a = a + 2 // Increment
    } while (a <= 20) // Condition
  }
}  