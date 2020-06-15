package tuto8.objects

object SingletonWithObject extends App {
  //comme A est un objet donc il ya une seule instance donc c'est le pattern singleton
  object A {
    def sum( i : Int, j : Int) :Int = i+j   //sum est comme une méthode statique en java
    def soustraction(i : Int, j : Int) = i-j
    // val a = new A // ERROR on ne peut pas unstancie  un objet
  }
  //puisque A est un objet on peut appeler les méthode et les attributs directement à travers cette objet comme les méthodes statiques en java
  println(A.sum(100,200))
  println(A.soustraction(200,100))
  /*
  Définition: le pattern(ne depend pas de langage de programmation) utility(class dans ce cas ) est une classe ou toutes les methodes sont statiques
  on utilise ce pattern pour créer des fonctionnalités qui ne dépend pas des objets par exemple afficher la date courante ne nécessite pas des objets
  pour afficher la date courante 
   */
  //on peut utiliser un object pour créer des méthodes utilities 

}
