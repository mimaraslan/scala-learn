package _021_This

// In scala, this is a keyword and used to refer current object.
// You can call instance variables, methods, constructors by using this keyword.
class MyThisClass {
  var id: Int = 0
  var name: String = ""

  def this(id: Int, name: String) {
    this()
    this.id = id
    this.name = name
  }

  def show() {
    println(id + " " + name)
  }
}

object _001_This {
  def main(args: Array[String]) {
    var student = new MyThisClass(123, "Katerina")
    student.show()
  }
}
