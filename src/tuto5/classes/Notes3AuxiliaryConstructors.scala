package tuto5.classes

object Notes3AuxiliaryConstructors {
  def main(args: Array[String]): Unit = {
    var p1 = new Point(1,2)
    var p2 = new Point(3)
    var p3 = new Point("ismahan")
    println(p1)
    println(p2)
    println(p3)

  }
  //un constructeur auxiliaire doit faire appel à un autre constriucteur deja implimenté que ce soit primaire ou
  //un autre constructeur auxiliare
  //seulement les parametres de constructeur primaire sont considérer comme des attributs
  class Point(x : Int , y: Int) { // classe et constructeur primaire
    //la declaration d'un costructeur auxiliare ce fait comme suit:
    //def this (param1 : type1 , param2 : type2,...)
    override def toString: String =s"les coordonnées de cet objet sont x= $x et y = $y"
    def this(){//constructeur sans parametre
      this(0,0)//appel au constructeur primaire
    }
    def this(x1 :Int){//constructeur à un seul parametre
      this(x1, 0)
    }
    //un constructeur auxiliaire peut faire un appel à un autre constructeur auxiliare
    def this(msg : String){
      this()//appel au constructeur sans parametre
      println(msg)
    }



  }

}
