package _0006_ternary_operators

object MainObject {
  def main(args: Array[String]): Unit = {
    
    val result = checkIt(-10)
    println(result)
  }

  def checkIt(a: Int) = if (a >= 0) 1 else -1 // Passing a if expression value to function
}  