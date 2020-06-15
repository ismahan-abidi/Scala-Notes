package tuto10.OptionEitherTRY

object OptionCase extends App {
  //l'utilisation des null est déconseillé et pour éviter de tomber dans l'exception NullPointerException on utilise
  //la classe Option
  //Option est une classe générique qui a deux implémentation Some et None
  //si la méthode retourne une valeur càd n'est pas null on le met dans Somme
  //si elle retourne null on met None
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }
val x=toInt("123")
  println(x)
  val y = toInt("ismahan")
  println(y)
  val z = toInt("1a")
  println(z)
}
