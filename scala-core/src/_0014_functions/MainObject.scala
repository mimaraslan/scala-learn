package _0014_functions

object MainObject {
  def main(args: Array[String]): Unit = {
    functionExample() // without = Operator

    var result = functionExample2() // with = Operator
    println(result)

    functionExample3(10, 20) // Parameterized

    result = functionExample4(15, 2) // Recursion
    println(result)

    var result1 = functionExample5(15, 2) // Calling with two values
    var result2 = functionExample5(15) // Calling with one value
    var result3 = functionExample5() // Calling without any value
    println(result1 + "\n" + result2 + "\n" + result3)

    result1 = functionExample6(a = 15, b = 2) // Parameters names are passed during call
    result2 = functionExample6(b = 15, a = 2) // Parameters order have changed during call
    result3 = functionExample6(15, 2) // Only values are passed during call
    println(result1 + "\n" + result2 + "\n" + result3)
  }

  //--------------------------------------

  def functionExample() { // without = Operator
    println("This is a simple function")
  }
  //--------------------------------------

  def functionExample2() = { // with = Operator
    var a = 10
    a
  }
  //--------------------------------------

  def functionExample3(a: Int, b: Int) = { // Parameterized
    var c = a + b
    println(c)
  }
  //--------------------------------------

  def functionExample4(a: Int, b: Int): Int = { // Recursion
    if (b == 0) // Base condition
      0
    else
      a + functionExample4(a, b - 1)
  }
  //--------------------------------------

  def functionExample5(a: Int = 0, b: Int = 0): Int = { // Parameters with default values as 0
    a + b
  }

  //--------------------------------------
  def functionExample6(a: Int, b: Int): Int = { // Named Parameter
    a + b
  }

}  