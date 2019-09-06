package _017_singleton_companion_object

object MySingletonObject {
  def hello() {
    println("My Singleton Object")
  }
}

class MyComapanionClass {
  def hello() {
    println("My Companion Class")
  }
}

object _002_CompanoinObject {
  def main(args: Array[String]) {
    MySingletonObject.hello() // No need to create object.
    new MyComapanionClass().hello()
  }
}