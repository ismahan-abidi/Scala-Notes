package tuto11.implicits

object ImplicitConversions extends App {
  val str = "haroun"
  implicit class MyMethodsString (s: String){
    def implicitIsmahan= println(s"la taille de cette chaine de caractère est  ${s.size}" )
  }
  str.implicitIsmahan

}
