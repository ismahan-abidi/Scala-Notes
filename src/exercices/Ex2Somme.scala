package exercices

object Ex2Somme {
  def main(args:Array[String]) ={
    def sum(a:Int, b : Int):Int ={
      if( a==b)    3*(a+b)
      else  a+b
    }
    println(sum(3,3))

  }

}
