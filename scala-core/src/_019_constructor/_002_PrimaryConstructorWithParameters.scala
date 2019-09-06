package _019_constructor

class MyStudent1 {
  println("Default constructor");
}

class MyStudent2(id: Int, name: String) {
  def showDetails() {
    println(id + " " + name);
  }
}

object _002_PrimaryConstructorWithParameters {
  def main(args: Array[String]) {
    new MyStudent1
    new MyStudent1()

    var objStudent =new MyStudent2(123, "Katerina")
    objStudent.showDetails()
  }
}