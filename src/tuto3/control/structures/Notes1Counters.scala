package tuto3.control.structures

object Notes1Counters {
  def main(args: Array[String]): Unit = {
    val a = Array("banana", "orange" , "fraise")
    //il ya plusieurs methodes pour parcourir un tableau
    //1) for each
    for (e <- a) println(e)
    println("****************")
    //2)foreach with multiple line
    for (e <- a) {
      // imagine this requires multiple lines
      val s = e.toUpperCase
      println(s)
      }
    println("****************")
    //3) for loop counter
    for (i <- 0 until a.length) {
      println(s"$i is ${a(i)}")
    }
    println("****************")
    //4) on peut creer un tableau ou bien collection à partir d'un autre tableau ou collection on utilisant yield
    val newArray = for (e <- a) yield e.toUpperCase
    for(z <- newArray)
   println(z)
    println("****************")
    //5)for loop counter until
    for (i <- 0 until a.length) {
      println(s"$i , ${a(i)}")
    }
    // parcourir par pair (element ,index) avec la methode zipWithIndex
    println("****************")
    for ((e, index) <- a.zipWithIndex) {
      println(s"$index : $e")
       }
  }


}
