package tuto8.objects

object CompanionObject extends App {
  //un object companion est un object qui a le meme non d'une classe et  qui est définit dans le meme fichier scala
  //on utilise un object companion pour définir les membres statiques d'une classe dans l'objet companion et les
  // membres non statique dans la classe
  class A {
    def f()= println("je suis la méthode f de A")
    def g() = println("je suis la méthode g ")
    private val i = 5
    //La classe A à l'accés à tout les membres de l'objet compagnion meme les privés
    println(A.j)
  }
  object A {
    def h() = println(s"je suis la méthode statique h de l'objet companion")
    //l'object companion à l'accès à tout les membres privé de la classe
    def k(a : A): Unit = println(a.i)
    private val j = 7
  }


}
