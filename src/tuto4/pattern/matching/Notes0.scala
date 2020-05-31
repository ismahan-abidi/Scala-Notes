package tuto4.pattern.matching

object Notes0 {
  def main(args: Array[String]): Unit = {
    f(1)
    f(13)
    f(5)
    println("-------------------------")
    val month = getValue(9)
    println(month)
    println("-------------------------")
    val i = matchingType("ismahan")
    println(i)
    println(matchingType(2))
    println(matchingType(1.5f))
    println(matchingType(1.5)) //pour les types float il faut ajouter f
    val p = new Personne
    println(matchingType(p))
    g(3)
  }

  //declaration d'une fonction type de retour void = Unit
  def f(i: Int) = { //:Unit equivalent à void en java
    i match {
      case 1 => println("january")
      case 2 => println("February")
      case 3 => println("March")
      case 4 => println("April")
      case 5 => println("May")
      case 6 => println("June")
      case 7 => println("July")
      case 8 => println("August")
      case 9 => println("September")
      case 10 => println("October")
      case 11 => println("November")
      case 12 => println("December")
      // catch the default with a variable so you can print it
      case inconnue => println("Unexpected case: " + inconnue.toString)
    }
  }

  //declaration d'une fonction avec un type de retour string
  //si une methode contient une seule instruction on peut ne pas faire le double accolade
  def getValue(x: Int): String = x match {
    case 1 => "january"
    case 2 => "February"
    case 3 => "March"
    case 4 => "April"
    case 5 => "May"
    case 6 => "June"
    case 7 => "July"
    case 8 => "August"
    case 9 => "September"
    case 10 => "October"
    case 11 => "November"
    case 12 => "December"
    // catch the default with a variable so you can print it
    case inconnue => "Unexpected case: " + inconnue.toString
  }

  //matching n'est pas limité seulement au constantes(au valeurs) on peut par exemple aussi faire le matching sur les types (String, Int , Personne, ..)
  def matchingType(x: Any): String = x match {
      //on ne peut pas utiliser  println car println de type Unit ne retourne pas de valeur
    case s: String => "x est un string "
    case i: Int => "x est un entier "
    case f: Float => "x est un float"
    case p: Personne => " x est une personne"
    case _ => "inconnu"
  }

  class Personne
  //il vaut mieux mettre le default case pour eviter l'exception MatchError
  def g( j : Int) : Unit = j match {
    case 0 => println("0 received")
    case 1 => println("1 is good, too")
  }

}
