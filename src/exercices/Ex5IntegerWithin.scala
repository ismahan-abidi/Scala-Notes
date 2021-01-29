package exercices

object Ex5IntegerWithin  extends App{
  def within(x:Int):Boolean = {
    x>= 20 && x<=100 |x==300
  }
println(within(50))
  println(within(400))
  println(within(300))
}
