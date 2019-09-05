package _0015_higher_order_functions

// Passing a Function as Parameter in a Function
object _001_PassingAFunctionAsParameterInAFunction {

  def main(args: Array[String]): Unit = {
    functionExample(8, multiplyBy3) // Passing a function as parameter
  }

  def functionExample(myValue: Int, myFunc: Int => AnyVal): Unit = {
    println(myFunc(myValue)) // Calling that function
  }

  def multiplyBy3(a: Int): Int = {
    a * 3
  }
}