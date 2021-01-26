package tuto8.objects

object CompanionObject extends App {
  //instance methods càd des méthodes non statiques
  //un object companion est un object qui a le meme nom d'une classe et  qui est définit dans le meme fichier scala
  //on utilise un object companion pour définir les membres statiques d'une classe dans l'objet companion et les
  // membres non statique dans la classe
  class A {
    def f()= println("je suis la méthode f de A non statique")
    def g() = println("je suis la méthode g  de A non statique")
    private val i = 5
    //La classe A à l'accés à tous les membres de l'objet compagnion meme les privés
    println(A.j)
  }
  //on définit dans object les membres statiques sans ecrire le mot static car static n'existe pas dans scala et on définit les membres statiques dans la classe
  // et les appelle avec une instance
  object A {

    def h() = println(s"je suis la méthode statique h de l'objet A companion")
    //l'object companion à l'accès à tous les membres privé de la classe
    def k(a : A): Unit = println(a.i)
    private val j = 7 //private Donc accessible seulement dans la classe ou companion object
     val jj = 0 // on n'écrit pas public en scala
  }
var obj = new A()
  obj.f()
  obj.g()
  //obj.k(new A)
 // obj.h()
  A.h()
  A.k(new A)
  println(A.jj)

}
