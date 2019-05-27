package _0002_variables_mutable_immutable

object MainObject {
  def main(args: Array[String]): Unit = {

    //  Data Types: Boolean, Char, String, Byte, Short, Int, Long, Float, Double

    var data = 100 // Mutable Variable
    data = 101

    var data2: Int = 100

    val data3 = 100 // Immutable Variable
    // data3 = 101  // Error: reassignment to val

  }
}  