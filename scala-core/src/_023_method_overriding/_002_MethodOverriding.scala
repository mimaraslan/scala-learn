package _023_method_overriding

class A {
  def getRate() = {
    0
  }
}

class B extends A {
  override def getRate() = {
    1
  }
}

class C extends A {
  override def getRate() = {
    2
  }
}

class D extends A {
  override def getRate() = {
    3
  }
}

object _002_MethodOverriding {
  def main(args: Array[String]) {
    val a = new A();
    var b = new B();
    var c = new C();
    var d = new D();
    println("A Rate of Interest: " + a.getRate())
    println("B Rate of Interest: " + b.getRate())
    println("C Rate of Interest: " + c.getRate())
    println("D Rate of Interest: " + d.getRate())
  }
}