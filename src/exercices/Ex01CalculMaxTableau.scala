package exercices

object Ex01CalculMaxTableau extends App{
  def maxTableau(array : Array[Int]) : Int = {
     var max = array(0)
    for(i <- 1 until array.length){
      if(array(i) > max)
        max = array(i)
    }
    max
  }
println(maxTableau(Array(0,1,10,5,4)))
}
