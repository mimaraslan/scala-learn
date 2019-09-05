package _0022_Inheritance

class A {
  var salary1 = 10000
}

class B extends A {
  var salary2 = 20000
}

class C extends B {
  def show() {
    println("salary1 = " + salary1)
    println("salary2 = " + salary2)
  }
}

object _002_MultilevelInheritance {
  def main(args: Array[String]) {
    var c = new C()
    c.show()
  }
}