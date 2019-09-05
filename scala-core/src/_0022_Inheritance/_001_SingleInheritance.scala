package _0022_Inheritance

class Employee {
  var salary: Float = 10000
}

class Programmer extends Employee {
  var bonus: Int = 5000
  println("Salary = " + salary)
  println("Bonus = " + bonus)
}

object _001_SingleInheritance {
  def main(args: Array[String]) {
    new Programmer()
  }
}