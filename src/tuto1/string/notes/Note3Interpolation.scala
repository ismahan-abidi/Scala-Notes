package tuto1.string.notes

object Note3Interpolation {

  def main(args: Array[String]): Unit = {
    //on peut subsituer des variables dans un string en commencant le string par s avant le premier double cote
    // et on precedant chaque variable par  dolar $
    val nom = "kouki"
    val prenom = "abdel"
    var age = 28
    println("afficher le nom "+ nom)
    println(s"afficher le nom $nom")
    val msg = s"nom = $nom,  prenom = $prenom , age = $age"
    println(msg)
    val string1 = s"la somme de 1 + 1 = ${ 1 + 1 }"
    val string2 = s"apres deux ans j'aurai ${age + 2} "
    println(string1)
    println(string2)
    println(s"tu as  28 ans ${age == 27 }")
    //on peut creer un classe dans une methode
    //declaration d'un class dans scala
    class Personne(var nom:String, var prenom : String, var cin : Int)
    //creation d'un objet
    val p = new Personne("abidi", "ismahan", 123)
    println(s"le nom du personne p est ${p.nom} " )
    //pour afficher des n chiffres apres la virgule on utilise la format f et %.nf
    val poids = 59
    println(f" monem pèse $poids%.2f")
    var string5 = "je \n suis la"
    println(string5)
    var string6 = raw"je \n m'appelle ismahan"
    println(string6)
    //on peut traiter un string caractere par caractere a travers des methode de la programmation fonctionnel tq map ,filter ect
    //map prend en parametre une fontion , cette fonction prend en parametre un caractere et renvoi un caractere
    val upper = "hello, world".map(c => c.toUpper)
    println(upper)
    // under score definit les parametres( exple:c => c) de la fonction interieur exemple la fonction map
    val upper1 = "hello, world".map(_.toUpper)
    println(upper1)
    //la methode filtre prend en parametre une fonction qui permet de filtrer les caracteres selon une condtion definit dans cette fonction
    val upper2 = "hello, world".filter(_ != 'l').map(_.toUpper)
    val upper3 = "hello, world".map( x => function_ismahan(x))
    println(upper2)
    println(upper3)

  }
  def function_ismahan(x :Char) : Char = x.toUpper
}
