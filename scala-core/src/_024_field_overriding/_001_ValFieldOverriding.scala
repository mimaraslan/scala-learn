package _024_field_overriding

class Vehicle {
  val speed: Int = 25
}

class Bike extends Vehicle {

  override
  val speed: Int = 100

  def show() {
    println(speed)
  }
}

object _001_ValFieldOverriding {
  def main(args: Array[String]) {
    var b = new Bike()
    b.show()
  }
}