package _0006_ternary_operators

object MainObject {
  def main(args: Array[String]): Unit = {
    
    var result = checkIt1(5)
    println(result)
    
    result = checkIt2(5)
    println(result)
  }
  
  // Passing a if expression value to function
  def checkIt1(a: Int):Int = { return if (a >= 0) 1 else -1 } 
  def checkIt2(a: Int) = if (a >= 0) 1 else -1 
}  