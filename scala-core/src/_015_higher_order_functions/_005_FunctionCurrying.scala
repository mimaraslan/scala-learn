package _015_higher_order_functions

// Function Currying
object _005_FunctionCurrying {
  def main(args: Array[String]) = {

    var result = add(2)(3)
    println("2 + 3 = " + result)

    var addIt = add(6) _
    var result2 = addIt(1)
    println("6 + 1 = " + result2)
  }


  def add(a: Int)(b: Int) = {
    a + b
  }

}