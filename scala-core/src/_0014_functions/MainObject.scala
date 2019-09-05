package _0014_functions

object MainObject {
  def main(args: Array[String]): Unit = {

    println("functionExample1: " + functionExample1())  // without = Operator

    var result2 = functionExample2() // with = Operator
    println("functionExample2: " + result2)

    var result3 = functionExample3(100, 40) // Parameterized
    println("\nfunctionExample3: " + result3)

    var result4 = functionExample4(15, 2) // Recursion
    println("functionExample4: " + result4)

    var result5_1 = functionExample5(15, 2) // Calling with two values
    var result5_2 = functionExample5(15) // Calling with one value
    var result5_3 = functionExample5() // Calling without any value
    println("functionExample5: " + result5_1 + " , " + result5_2 + " , " + result5_3)

    var result6_1 = functionExample6(a = 1, b = 4) // Parameters names are passed during call
    var result6_2 = functionExample6(b = 10, a = 20) // Parameters order have changed during call
    var result6_3 = functionExample6(2, 6) // Only values are passed during call
    println("functionExample6: " + result6_1 + " , " + result6_2 + " , " + result6_3)
  }

  //======================================

  def functionExample1() { // without = Operator like void
    println("This is a simple function")
  }
  //--------------------------------------

  def functionExample2() = { // with = Operator
    var a = 20
    a
  }
  //--------------------------------------

  def functionExample3(a: Int, b: Int) = { // Parameterized
    var c = a + b
    print(c)
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