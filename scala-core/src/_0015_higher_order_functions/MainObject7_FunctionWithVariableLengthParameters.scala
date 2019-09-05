package _0015_higher_order_functions

// Function with Variable Length Parameters
object MainObject7_FunctionWithVariableLengthParameters {

  def main(args: Array[String]) = {

    var sum = add(1, 2, 3, 4, 5, 6, 7, 8, 9);
    println(sum);
  }

  def add(args: Int*) = {
    var sum = 0;
    for (a <- args) sum += a
    sum
  }

}