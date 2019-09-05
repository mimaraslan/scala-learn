package _0016_object_class

class Arithmetic {
  def add(a: Int, b: Int) {
    var result = a + b;
    println("sum = " + result);
  }
}

object MainObject4_AnonymousObject {
  def main(args: Array[String]) {
    new Arithmetic().add(2, 3);
  }
}