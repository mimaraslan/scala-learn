package _015_higher_order_functions

// Nested Functions
object _006_NestedFunctions {

  def main(args: Array[String]) = {

    var result = add(2, 2, 2)
    println(result)
  }


  def add(a: Int, b: Int, c: Int) = {

    def add2(x: Int, y: Int) = {
      x + y
    }

    add2(a, add2(b, c))
  }

}