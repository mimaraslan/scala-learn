package _0019_constructor

class MyStudent3(id: Int, name: String) {
  var age: Int = 25

  def showDetails() {
    println(id + " " + name + " " + age)
  }

  def this(id: Int, name: String, age: Int) {
    this(id, name) // Calling primary constructor, and it is first line
    this.age = age
  }
}

object _003_SecondaryAuxiliaryConstructor {
  def main(args: Array[String]) {
    var objStudent = new MyStudent3(123, "Katerina")
    objStudent.showDetails()
  }
}