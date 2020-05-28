package tuto3.control.structures

object Notes3MultipleCounters {
  def main(args: Array[String]): Unit = {

    //1) boucle for avec deux compteurs
    for (i <- 1 to 2; j <- 1 to 2) println(s"i = $i, j = $j")
    //
    println("--------------------")
    //il est preconisé d'utiliser les doubles accolades
    for {
      i <- 1 to 2
      j <- 1 to 2
    } println(s"i = $i, j = $j")
    println("--------------------")
    //2) triple compteurs
    for {
      i <- 1 to 3
      j <- 1 to 2
      k <- 1 to 4
    } println(s"i = $i, j = $j, k = $k")
    println("--------------------")
    //declaration d'un tableau avec la dimension 2*2
   val array =  Array.ofDim[Int](2,2)
    array(0)(0)=10
    array(0)(1)=20
    array(1)(0)=30
    array(1)(1)=40
    for(i <- 0 to 1 ; j<- 0 to 1 ) println(s" ($i)($j) = ${array(i)(j)}" )


  }

}
