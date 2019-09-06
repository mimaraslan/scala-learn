package _015_higher_order_functions

// Multiline Expression in Function
object _004_MultilineExpressionInFunction {
  def main(args: Array[String]) = {

    var result1 = add1(10, 5)
    println(result1)

    var result2 = add2(10, 5)
    println(result2)

    var result3 = add3(10, 5)
    println(result3)
  }


  def add1(a: Int, b: Int) = {
    a
    +b
  }

  def add2(a: Int, b: Int) = {
    a +
      b
  }

  def add3(a: Int, b: Int) = {
    (a
      + b)
  }

}