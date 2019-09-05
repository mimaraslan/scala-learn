package _0017_singleton_companion_object

object SingletonObject1 {
  def hello() {
    println("Hello, This is Singleton Object 1")
  }
}

object SingletonObject2 {
  def hello() {
    println("Hello, This is Singleton Object 2")
  }
}

object SingletonObject3 {
  def hello() {
    println("Hello, This is Singleton Object 3")
  }
}

object _001_SingletonObject {
  def main(args: Array[String]) {
    SingletonObject1.hello() // No need to create object.
    SingletonObject2.hello() // No need to create object.
    SingletonObject3.hello() // No need to create object.
  }
}