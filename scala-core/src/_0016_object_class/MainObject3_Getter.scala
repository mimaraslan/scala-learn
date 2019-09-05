package _0016_object_class

class Student(id: Int, name: String) {
  def getRecord() {
    println(id + " " + name);
  }
}

object MainObject3_Getter {
  def main(args: Array[String]) {
    var student1 = new Student(1, "Katerina");
    var student2 = new Student(2, "Yulya");
    var student3 = new Student(3, "Lena");
    student1.getRecord();
    student2.getRecord();
    student3.getRecord();
  }
}