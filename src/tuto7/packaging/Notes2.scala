package tuto7.packaging

object Notes2  extends App {
  //on scala on peut importer plusieurs pakage entre accolade
  //le _ est equivalent au * dans java
  //dans scala on peut importer des package n'importe ou (dans une méthode, fonction, classes,...)
  class Foo {  // only visible in this class
    //on scala on peut renommer les membres(classes , méthodes) lors de l'importation
    import java.util.{ArrayList => JavaList}//on a renommé ArrayList par JavaList
    val liste = new JavaList[String]()
    //on peut meme renommer plusieurs membres de meme package au meme temps
    //une fois on a donné un alias à un membre d'un package on pourrait pas utilisé le nom réel de ce membre
   // val map = new HashMap[String, String] :ERROR
    //on scala on peut caché un classe lors de l'importation de son package càd on importe toutes les classes sauf un
    import java.util.{Random => _, _}//dans cette exemple il va caché Random et afficher tout les autres
    //val r = new Random // can't access Random
    val arrayListe = new ArrayList  // can access other members
    //on peut cacher plusieur classe
    import java.util.{List => _, Map => _, Set => _}//on cite les classe à cacher au début puis on écrit le _ de tous les autres


  }

}
