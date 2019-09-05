package _0015_higher_order_functions

// Anonymous (no name) (lambda) Function
object MainObject3_AnonymousNoNameLambdaFunction {
    def main(args: Array[String]) = {

      var result1 = (a:Int, b:Int) => a+b   // Anonymous function by using => (rocket)
      println(result1(44,6))

      var result2 = (_:Int)+(_:Int)         // Anonymous function by using _ (underscore) wild card
      println(result2(44,6))
    }
  }