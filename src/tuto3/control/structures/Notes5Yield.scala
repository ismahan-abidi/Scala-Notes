package tuto3.control.structures

object Notes5Yield {
  def main(args: Array[String]): Unit = {
    val names = Array("chris", "ed", "maurice")
    val capitalizedName = for (e <- names) yield  e.capitalize
    for(e <- capitalizedName) println(e)
    println("*****************")
    val longuersMots = for (e <- names) yield {
      // imagine that this required multiple lines of code
       e.length
      }
     for(e <- longuersMots) println(e)

    /**
     * le type de la collection resultat a generalement le meme type de la collection de depart
     * exemple si la collection de depart est de type array la collection resultat est de type array
     * si la collection de depart est de type list la collection resultat est de type list
     */

  }

}
