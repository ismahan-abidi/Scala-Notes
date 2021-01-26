package tuto1.string.notes

object Note1Equals {
  def main(args: Array[String]): Unit = {
    // dans scala on utilise == pour comparer deux obejets pas comme java avec equals
    val s1 = "hello"
    val s2 = "Hello"
    //pour comparer deux chaînes de manière non sensible à la casse on ajoute soit la methode toUpperCase(tout en majiscule) soit toLowerCase
    println(s1.toUpperCase == s2.toUpperCase)
    val s3 = null // la reference s3 ne pointe sur aucun objet
    val s4 = null
    //println(s3.toUpperCase == s4.toUpperCase)// value toUpperCase is not a member of Null, car la méthode toUpperCase s'applique sur les objets
    val a = "Ismahan"
    val b = "ismahan"
    println(a.equalsIgnoreCase(b))
    //pour créer un String multiline il suffit de l'entourer par 3 double cotes
    val foo =
      """This is
       a multiline
       String"""
    println(foo)
    //on remarque que l'espace blanc au debut de chaque ligne est pris en compte
    //on peut le supprimer on ajoutant | le pipe au debut de chaque ligne on appelant la methode .stripMargin
    val str =
    """je suis
      |tres
      |enervée""".stripMargin
    println(str)
    //pour annuler le retour a la ligne et le remplacer par un espace on utilise replaceALL("\n" , " ")
    val speech =
      """Four score and
        |seven years ago
        |our fathers""".stripMargin.replaceAll("\n", " ")
    println(speech)

  }


}
