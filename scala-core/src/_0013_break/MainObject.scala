package _0013_break

import scala.util.control.Breaks._ // Importing  package

object MainObject {
  def main(args: Array[String]): Unit = {

    println("Breakable method and Break")

    breakable { // Breakable method to avoid exception
      for (i <- 1 to 10 by 1) {
        if (i == 7)
          break // Break used here
        else
          println(i)
      }
    }

    println("Breakable method and Break inner Loop")

    for (i <- 1 to 3) {
      breakable {
        for (j <- 1 to 3) {
          if (i == 2 & j == 2)
            break
          println(i + " " + j)
        }
      }
    }

  }
}  