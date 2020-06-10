package tuto9.functional.programming

object Notes1AnonymousFunctions  extends App {
  //Anonymous Functions est une fonction anonyme cad sans nom
  val x = List.range(0,10)
  //par exemple: la méthode filtre dans cette exemple prend en parametre une fonctions sans nom (i: Int) => i % 2 == 0
  val evens = x.filter((i: Int) => i % 2 == 0)
  //on peut remplacer le paramètre de la fonction par _ exemple , val evens = x.filter(_ % 2 == 0)
  //la partie gauche du fléche représente les paramètre de la fonction anonyme et la partie droite l'implémentation
  //comme scala peut inférer les types on peut enlever le type de paramètre car la liste ne contient que des entiers
  val evens1 = x.filter(i => i % 2 == 0)
  //on peut enlever aussi enlever le paramètre cad toute la  partie gauche et le remplacer par _
  val evens2 = x.filter(_ % 2 == 0)


}
