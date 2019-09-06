package _025_final

class Vehicle2 {
  final def show() {
    println("vehicle is running")
  }
}

class Bike2 extends Vehicle2 {
  //override val speed:Int = 100
  override def show() {
    println("bike is running")
  }
}

object _002_FinalMethod {
  def main(args: Array[String]) {
    var b = new Bike2()
    b.show()
  }
}