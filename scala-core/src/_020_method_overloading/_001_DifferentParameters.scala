package _020_method_overloading

class Arithmetic {

  def add(a: Int, b: Int) {
    var sum = a + b
    println(sum)
  }

  def add(a: Int, b: Int, c: Int) {
    var sum = a + b + c
    println(sum)
  }

}

object _001_DifferentParameters {

  def main(args: Array[String]) {
    var a = new Arithmetic();
    a.add(3, 2);
    a.add(20, 30, 50);
  }

}