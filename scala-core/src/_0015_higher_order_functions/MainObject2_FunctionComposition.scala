package _0015_higher_order_functions

// Function Composition
object MainObject2_FunctionComposition {

  def main(args: Array[String]) = {
    var result = multiplyBy5(add3(1)) // Function composition
    println(result)
  }

  def add3(a: Int): Int = {
    a + 3
  }

  def multiplyBy5(a: Int): Int = {
    a * 5
  }
}