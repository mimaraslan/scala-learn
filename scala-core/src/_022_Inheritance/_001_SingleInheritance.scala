package _022_Inheritance

class Employee {
  var salary: Float = 10
}

class Programmer extends Employee {
  var bonus: Int = 5
  println("Salary = " + salary)
  println("Bonus = " + bonus)
}

object _001_SingleInheritance {
  def main(args: Array[String]) {
    new Programmer()
  }
}