package tuto3.control.structures

object Notes4Guards {
  def main(args: Array[String]): Unit = {
    //print all even numbers (afficher tout les nombres pairs)
    for (i <- 1 to 10 if i % 2 == 0) println(i)
    println("*************")
    //on peut ecrire la meme commande precedente avec plusieurs lignes
    for {
      i <- 1 to 10
      if i % 2 == 0
    } println(i)
    println("*************")
    //on peut ajouter pliusieurs gards quand on veut
    for {
      i <- 1 to 10
      if i > 3
      if i < 6
      if i % 2 == 0
    } println(i)
  }

}
