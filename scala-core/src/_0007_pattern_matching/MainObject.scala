package _0007_pattern_matching

object MainObject {
  def main(args: Array[String]): Unit = {
    
    var a = 2
    a match {
      case 1 => println("One")
      case 2 => println("Two")
      case _ => println("Other")
    }

    var result = search("Hello")
    print(result)
    
    result = search(1)
  print(result)
  }

  def search(a: Any): Any = a match {
    case 1       => println("One")
    case "Two"   => println("Two")
    case "Hello" => println("Hello Scala")
    case _       => println("Other")
  }
}  