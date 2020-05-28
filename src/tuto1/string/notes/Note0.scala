package tuto1.string.notes

object Note0 {
  def main(args: Array[String]): Unit = {
    println("Hello, world".getClass.getName)
    //le resultat de l'affichage "java.lang.String "=> le string dans scala est le meme de java
    //ces methodes : length , split, concatination sont les methodes de la classe String de java
   val  valeur1 = "monem "
    println(valeur1.length)
    val valeur2 = "epoux abidi"
    val concatenation = valeur1 + valeur2
    println(concatenation)
    val resultat = concatenation.split(" ")
    //for each permet de parcourir le tableau resultat mot par mot si c'etait une chaine de caractere ou caractere donc il va parcourir caractere par caractere
    for(e <- resultat)
      println(e)
    //en revanche on peut trouver des methodes qui n'appartiennet pas au classe String du java mais on le trouve dans scala comme foreach
    //c'est du à la notion de convertion implicite qu'on va le voir apres
    //ces methodes existent dans des classe comme StringOpps , StringLike, WrappedString
    valeur1.foreach(x => println(x))
    for (c <- "haroun") println(c)
    // les conversions implicites des string se faitent dans l'objet Predef
    //la classe String dans java est final class cad on ne peut pas l'heriter mais avec la convertion implicite on peut ajouter des methodes dans cette class
    println ("ismahan".drop(2).take(2).capitalize )
    //drop(n) permmet d'effacer les n premier caractere, take(m) permet dafficher seulement les m mremier mettre , capitalize permet de metre le premier lettre en majiscule

  }

}
