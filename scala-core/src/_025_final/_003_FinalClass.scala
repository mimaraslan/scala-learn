package _025_final

final class Vehicle3 {
  def show() {
    println("vehicle is running")
  }

}

// error: illegal inheritance from final class Vehicle
class Bike extends Vehicle3 {
  override def show() {
    println("bike is running")
  }
}

object _003_FinalClass {
  def main(args: Array[String]) {
    var b = new Bike()
    b.show()
  }
}