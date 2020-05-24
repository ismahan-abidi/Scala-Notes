package tuto1.string.notes

object Note3Interpolation {
  def main(args: Array[String]): Unit = {
    //on peut subsituer des variables dans un string en commencon le string par s avant le premier double cote
    // et on precedant chaque variable par  dolar $
    val nom = "kouki"
    val prenom = "abdel"
    var age = 28
    println("afficher le nom "+ nom)
    println(s"afficher le nom $nom")
    val msg = s"nom = $nom,  prenom = $prenom , age = $age"
    println(msg)
  }

}
