package _0019_constructor

class MyStudent4(id: Int) {

  def this(id: Int, name: String) = {
    this(id)
    println(id + " " + name)
  }

  println(id)
}

object _004_ConstructorOverloading {
  def main(args: Array[String]) {
    new MyStudent4(1)
    new MyStudent4(2, "Katerina")
  }
}