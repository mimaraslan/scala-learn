package _016_object_class

class Student1 {
  var id: Int = 0; // All fields must be initialized
  var name: String = null;
}

object _001_ClassInstanceVariables {
  def main(args: Array[String]) {
    var s = new Student1() // Creating an object
    println(s.id + " " + s.name);
  }
}
