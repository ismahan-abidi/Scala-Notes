package exercices

import scala.math.abs

object Ex3DifferenceAbsolu extends App{
  def differenceAbsolu(n : Int) = {
    if(n>51)
      3*abs(n-51)
    else abs(n-51)
  }
println(differenceAbsolu(20))
}
