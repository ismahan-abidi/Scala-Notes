package exercices

object Ex4CheckInteger extends App{
def checkInteger ( x : Int, y:Int):Boolean = {
  x ==30 | y==30 |x+y ==30

}
  println(checkInteger(10 , 20))
  println(checkInteger(30 , 20))
  println(checkInteger(0 , 30))
  println(checkInteger(10 , 50))

}
