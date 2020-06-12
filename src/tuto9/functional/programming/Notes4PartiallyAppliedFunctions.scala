package tuto9.functional.programming

object Notes4PartiallyAppliedFunctions extends App{
  val sum =(x:Int, y:Int,z:Int) => x+y+z
  val x = sum(1,2,3)
  println(x)
  val a = sum(5,_ : Int,_ : Int) // a devient une fonction a(y :Int, z :Int) = 5+y+z
  val b = sum(7,2,_ : Int)  // b devient une fonction qui prend en paramètre un seul entier et retourne un entier b(z:Int) => 9 +z
}
