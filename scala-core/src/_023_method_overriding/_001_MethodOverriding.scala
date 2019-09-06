package _023_method_overriding

class Vehicle {
  def run() {
    println("Vehicle is running")
  }
}

class Bike extends Vehicle {
  override def run() {
    println("Bike is running")
  }
}

object _001_MethodOverriding {
  def main(args: Array[String]) {

    var vehicle = new Vehicle()
    vehicle.run()

    var bike = new Bike()
    bike.run()

  }
}