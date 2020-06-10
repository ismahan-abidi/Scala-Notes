package tuto4.pattern.matching

object Notes4Subtypes {
  def main(args: Array[String]): Unit = {
    val i1: Nom_Interface = new A("ISMAHAN")
    //on peut ne pas utiliser le mot cle new si la classe est case classe
    val i2: Nom_Interface = B("kouki", 28)
    f(i1)
    f(i2)
  }

  trait Nom_Interface //creation d'un trait l'equivalent d'une interface
  case class A(x: String) extends Nom_Interface
  case class B(y: String, z: Int) extends Nom_Interface

  def f(i: Nom_Interface): Unit = i match {
    case A(a) => println(s"l'objet affecte est de A $a")
    case B(b, c) => println(s"l'objet affecte est de B $b , $c")
  }

}
