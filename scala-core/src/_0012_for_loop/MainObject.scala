package _0012_for_loop

object MainObject {
  def main(args: Array[String]): Unit = {

    print(" for to:\t")
    for (a <- 1 to 10) {
      print(a + " ")
    }

    print("\n for until:\t")
    for (a <- 1 until 10) {
      print(a + " ")
    }

    print("\n for filtering:\t")
    for (a <- 1 to 10 if a % 2 == 0) {
      print(a + " ")
    }

    print("\n for yield:\t")
    var myResult = for (a <- 1 to 10) yield a
    for (i <- myResult) {
      print(i + " ")
    }

    print("\n for collection:")
    var myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9) // Creating a list
    for (i <- myList) { // Iterating the list
      print(i + " ")
    }

    print("\n foreach:\t")
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9) // Creating a list
    list.foreach {
      println // Print each element
    }
    list.foreach(print)
    println
    list.foreach((element: Int) => print(element + " ")) // Explicitly mentioning type of elements

    print("\n for to by:\t")
    for (i <- 1 to 10 by 3) {
      print(i + " ")
    }

  }
}  