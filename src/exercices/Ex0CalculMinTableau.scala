package exercices

object Ex0CalculMinTableau extends App{
  def minTableau(array : Array[Int]) :  Int = {
    var min = array(0)
    for(i<- 1 until array.length){
      if(array(i) < min)
        min = array(i)
    }
          min
  }
println(minTableau(Array(5,3,1,4)))
}
