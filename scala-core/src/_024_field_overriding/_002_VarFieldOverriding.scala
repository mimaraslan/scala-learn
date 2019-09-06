package _024_field_overriding

class Vehicle2 {
  val speed: Int = 25
}

class Bike2 extends Vehicle2 {

  // variable speed cannot override a mutable variable
  override
  val speed: Int = 100

  def show() {
    println(speed)
  }
}

object _002_VarFieldOverriding {
  def main(args: Array[String]) {
    var b = new Bike2()
    b.show()
  }
}