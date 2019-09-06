package _002_variables_mutable_immutable

object MainObject {
  def main(args: Array[String]): Unit = {

    //  Data Types: Boolean, Char, String, Byte, Short, Int, Long, Float, Double

    var data1 = 100 // Mutable Variable
    println(data1)
    
    data1 = 101
    println(data1)

    var data2: Int = 100 // Mutable Variable
    println(data2)    
    
    val data3 = 100 // Immutable Variable
    // data3 = 101  // Error: reassignment to val
    println(data3)
    
  }
}  