package _0019_constructor

class Student1{
  println("Default constructor")
}


object _001_DefaultPrimaryConstructorNoParameters {
  def main(args: Array[String]) {
    new Student1
    new Student1()
  }
}