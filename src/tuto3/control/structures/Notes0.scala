package tuto3.control.structures

object Notes0 {
  def main(args: Array[String]): Unit = {
    // Yield : permet de créer une collection à partir d'une autre à travers  une boucle for et autre
    val firstCollection = List("emily", "hannah", "mercedes", "porsche")
    val nouvelleCollection = for (n <- firstCollection) yield n.capitalize
    println(nouvelleCollection)
    val newCollection = for(x <- firstCollection) yield x.filter(_ != 'e')
    println(newCollection)
     //la correspondence de swish case de java s'appelle pattern matching en scala
    //for loop counters
    for (i <- 0 until 10) {
      println(s" i = $i")
    }
  }

}
