package tuto4.pattern.matching

object Notes2DefaultCase {
  def main(args: Array[String]): Unit = {

    f(5)
    f(0)
    f(1)
    println("-------------------------------------------------")
    //il est important de faire un match par defaut si non on va tomber dans l'exception MatchError
    val y = "ismahan"
    y match {
      case "monem" => println("mechant")
      case "haroun" => println("gentil")
    }

  }
  def f(i :Int) : Unit = i match {
    //on ne peut pas recuperer la valeur par defaut quand on utilise le wildcard(_)
    //pour acceder a cette valeur il faut le capter dans une variable
    case 0 => println("1")
    case 1 => println("2")
    case variable => println("You gave me: " + variable)
  }

}
