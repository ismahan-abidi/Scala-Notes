package tuto5.classes

object Notes5PrivatePrimaryConstructor {
  //la methode f est static car dans un object
  def f(): Unit ={
  }
  def main(args: Array[String]): Unit = {
    val a1 = A.getInstance
    println(a1)
    //utility classes ce sont des classes ou toutes les méthodes sont statiques
  }
  class A private(x: String) { //class et constucteur primaire privé
    override def toString: String = "creation du constructeur primaire privé"
  }
  object A { //creation de l'objet compagnion
    val a = new A("ismahan") //creation de l'objet du class
    def getInstance = a//<=> def getInstance {return a} mais return n'existe pas dans scala
  }
}
