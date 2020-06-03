package tuto5.classes.Notes1

object Notes1PrimaryConstructor extends App{
  //declaration d'un costructeur primaire
  //un constructeur primaire est un costructeur creer avec la declaration de la classe qui contient un ensemble des parametres
  //ces parametres sont des attributs
  //on peut declarer aussi des autres attributes dans le corps de constructeur primaire exple Home , age
  //on peut aussi declarer des methodes dans le corp du constructeur primaire
  //les instructions dans le constructeur primaire seront executer lors de la creation d'un objet
  //=>ces instruction font partie des corps de constructeur
  class Person(var firstName: String, var lastName: String) {
    println("creation d'un costructeur avec deux parametres")
    // some class fields (attributs )
    private val HOME ="bla bla bla"
    var age = 28
    // some methods
    override def toString = s"$firstName $lastName is $age years old"
    def printHome { println(s"HOME = $HOME") }
    def printFullName { println(this) } // uses toString
    printHome
    printFullName
    println("still in the constructor")
  }
  val p = new Person("ismahan" , "abidi")
  val p1 = new Person("abdel" , "kouki")
  p.firstName="haroun"
  p.lastName="kouki"
  p.age = 5
  p.firstName_$eq("Metta World Peace")//appel de la methode setter
  //on ne peut pas faire une affectation dans le println  car l'affectation ne retourne pas de valeur
  //println(p.firstName="haroun") ne fonctionne pas
  println("the new first name is " + p.firstName)
  println("the new last name is " + p.lastName + " à " +p.age+ " mois")

}
