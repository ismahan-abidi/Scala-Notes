package tuto3.control.structures

object Notes0 {
  def main(args: Array[String]): Unit = {
    // Yield : permet de créer une collection à partir d'une autre à travers  une boucle for et autre
    val firstCollection = List("emily", "hannah", "mercedes", "porsche")
    val nouvelleCollection = for (n <- firstCollection) yield n.capitalize
    println(nouvelleCollection)
    //la correspondence de swish case de java s'apalle pattern matching en scala
    //for loop counters
    for (i <- 0 until 10) {
      println(s" i = $i")
    }
  }

}
