package exercices

object Ex9TriTableau extends App{
  //array(9,5,10,2,0,4,8,7,16,3)
  def triSelectionTableau(array : Array[Int]) : Array[Int] = {
    for (i<-0 until array.length-1) {
      var index = i
      for(j<- i+1 until array.length) {

          if(array(j) < array(index)) {index = j}
        }
      val min = array(index)
        array(index) = array(i)
        array(i) = min
      }
     array
      }

  triSelectionTableau(Array(9,5,10,2,0,4,8,7,16,3)).foreach(x =>println(x))
    }




