package _016_object_class

class Student3(id: Int, name: String) {
  def getRecord() {
    println(id + " " + name);
  }
}

object _003_Getters {
  def main(args: Array[String]) {
    var objStudent1 = new Student3(1, "Katerina");
    var objStudent2 = new Student3(2, "Yulya");
    var objStudent3 = new Student3(3, "Lena");
    objStudent1.getRecord();
    objStudent2.getRecord();
    objStudent3.getRecord();
  }
}