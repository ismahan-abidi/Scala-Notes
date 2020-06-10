package tuto5.classes

object Notes4AuxiliaryConstructorsCaseClass {
  //les constructeurs auxiliaires d'un case classe sont different aux constructeur d'un classe ordinaire
  //pour creer un constructeur auxiliaire d'un case classe il suffit d'implementer la methode apply dans l'objet compagnon
  //un objet compagnon est objet qui a le meme nom d'un classe declarer dans le meme fichier.scala
  case class Animal(var name : String, var age : Int ){ //si on ne met pas var devant l'attrubut  dans case class il le considère comme val
    override def toString: String = s"le nom de l'animal est $name son age est $age ans "
  }
  object Animal{
    def apply(name: String): Animal = new Animal(name, 0)

    def apply( age: Int): Animal = new Animal("", age)

    def apply(): Animal = new Animal("", 0)
   //le compilateur va generer la methode apply du constructeur primaire => on n'a pas besoin de faire la méthode apply avec deux parametre ici
    //def apply(name: String, age: Int): Animal = new Animal("chien", 5)
  }

  def main(args: Array[String]): Unit = {
    //ici le compilateur va appeler la methode Animal.apply("MINOUCHA" , 8)
    var animal0 = Animal("MINOUCHA" , 8)
    var animal1 = Animal("MINOUCHA")//dans le case classe on n'a pas obliger de mettre new pour creer un objet
    var animal2 = Animal(2)
    var animal3 = Animal()
    println(animal1)
    println(animal2)
    println(animal3)
    println(animal0)


  }
}
