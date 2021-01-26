package tuto11.implicits

object ImplicitConversions extends App {
  //les conversions implicits permet au compilateur de convertir un type un autre , ici on a convertit le type String str en un objet de type MyMethodString
  // si on fait un appel à une méthode qui appartient à une classe implicit
  val str = "haroun"
  implicit class MyMethodsString (s: String){
    def implicitIsmahan= println(s"la taille de cette chaine de caractère est  ${s.size}" )
  }
  str.implicitIsmahan

}
