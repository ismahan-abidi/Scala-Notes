package tuto1.string.notes

object Note4RegularExpression {
  def main(args: Array[String]): Unit = {
    //Regex (regular expression) on utilise les expressions régulières pour voir si un string contient un pattern ou non
    //pour creer un pattern on appelle la methode .r sur un string qui contient le patern
    val numPattern = "[0-9]+".r
    val address = "123 Main Street Suite 101"
    //pour trouver le premier patern on utilisa la methode findFirstIn
    val match1 = numPattern.findFirstIn(address)
    println(match1)
    //pour trouver tout les patern on utilisa la methode findAllIn
    val match2 = numPattern.findAllIn(address)
    match2.foreach(println)
  }

}
