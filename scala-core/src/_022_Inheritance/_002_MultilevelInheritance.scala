package _022_Inheritance

class A {
  var salary1 = 10
}

class B extends A {
  var salary2 = 20
}

class C extends B {
  var salary3 = 30

  def show() {
    println("salary1 = " + salary1)
    println("salary2 = " + salary2)
    println("salary3 = " + salary3)
  }
}

object _002_MultilevelInheritance {
  def main(args: Array[String]) {
    var c = new C()
    c.show()
  }
}