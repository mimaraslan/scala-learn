package _0021_This

class Student(name: String) {
  def this(name: String, age: Int) {
    this(name)
    println(name + " " + age)
  }
}

object _002_ConstructorThis {
  def main(args: Array[String]) {
    new Student("Katerina", 123)
  }
}