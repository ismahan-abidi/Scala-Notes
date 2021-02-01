package exercices

object Ex10Factorielle extends App {
  def factorielle(n: Int): Int = {
    var fact = 1

      for (i <- 0 until n) {
        fact = fact * (n - i)
      }
      fact
  }
  def factRecursive(n : Int):Int = {
    var fact = 1
    if(n==0 || n == 1) 1
    else   n*factRecursive(n-1)
  }



  println(factorielle(0))
  println(factorielle(3))
  println(factorielle(4))
 println(factRecursive(3))



}