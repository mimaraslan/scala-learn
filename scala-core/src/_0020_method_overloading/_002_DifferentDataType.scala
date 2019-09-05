package _0020_method_overloading

class Arithmetic2 {

  def add(a: Int, b: Int) {
    var sum = a + b
    println(sum)
  }

  def add(a: Double, b: Double) {
    var sum = a + b
    println(sum)
  }
}

object _002_DifferentDataType {

  def main(args: Array[String]) {
    var b = new Arithmetic2()
    b.add(4, 2)
    b.add(20.0, 30.0)
  }
}
