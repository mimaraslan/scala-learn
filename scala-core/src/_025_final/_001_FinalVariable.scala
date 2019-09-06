package _025_final

class Vehicle {
  final val speed: Int = 25
}

class Bike extends Vehicle {

  // Error - value speed cannot override final member
  override val speed: Int = 100

  def show() {
    println(speed)
  }
}

object _001_FinalVariable {
  def main(args: Array[String]) {
    var b = new Bike()
    b.show()
  }
}