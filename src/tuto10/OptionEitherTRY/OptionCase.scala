package tuto10.OptionEitherTRY

object OptionCase extends App {
  //on utilise Option pour éviter NullPointerException càd pour éviter de retourner des valeurs nulles
  //l'utilisation des null est déconseillé et pour éviter de tomber dans l'exception NullPointerException on utilise
  //la classe Option
  //Option est une classe générique qui a deux implémentations Some et None
  //si la méthode retourne une valeur càd n'est pas null on le met dans Some
  //si elle retourne null on la met  dans None
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim)) // la méthode trim() permet d'effacer les espaces  au début de la  chaine de caractère
      // pourquoi on a utilisé trim() quel espace on veut l'effacer sachant qu'on a  parser String en Int
    } catch {
      case e: Exception => None
    }
  }
val x=toInt("         1235")
  println(x)
  val y = toInt("ismahan")
  println(y)
  val z = toInt("1a")
  println(z)
  println( "100".toInt)

  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
  println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
  println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))
}
