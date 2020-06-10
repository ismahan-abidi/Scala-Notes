package tuto4.pattern.matching
//on peut heriter la class App pour executer des instructions au lieu d'utiliser la methode main
object Notes3PatternMatchingTypes extends App{
  //les differents types de pattern matching en scala sont :
  // 1.a constant pattern,
  // 2.constructor pattern,
  // 3.sequence pattern,
  // 4.tuple pattern,
  // 5.or type pattern.
  ///------------------------------------
  // 1. lancer le constant pattern:
  println(pattern_mutching_type(0))
  println(pattern_mutching_type(true))
  println(pattern_mutching_type("hello"))
  println(pattern_mutching_type(""))
  println("--------------------------------------")
  // 2. lancer le constructor pattern:
  val p0 = Personne("kouki", "abdel")
  val p = Personne("kouki", "haroun")
  val p1 = Personne("abidi", "ismahan")
  var c = Cercle(2)
  println(pattern_mutching_type(p0))
  println(pattern_mutching_type(p))
  println(pattern_mutching_type(p1))
  println(pattern_mutching_type(c))
  println("--------------------------------------")
  // 3.lancer sequence pattern:
  val liste1 = List(0,2,3)
  val liste2 = List(1,7,8,9)
  val vector1 = Vector(1,0,3,4,8,9,4,5,6)
  println(pattern_mutching_type(liste1))
  println(pattern_mutching_type(liste2))
  println(pattern_mutching_type(vector1))
  println("--------------------------")
  // 4.lancer tuple pattern,*
  println(pattern_mutching_type((1,2)))
  println(pattern_mutching_type((1,2,3)))
  println("--------------------------------------")
  // 5.lacer type pattern.
  println(pattern_mutching_type("ismahan abidi"))
  println(pattern_mutching_type(2))
  println(pattern_mutching_type(2.5f))
  println(pattern_mutching_type(Array(2,3,5,7)))
  println(pattern_mutching_type(Array("a","b","c","d")))
  println(pattern_mutching_type(Cercle(5)))
  println(pattern_mutching_type(List(7,1,2,3,5)))
  println(pattern_mutching_type(Map(5->"aa",6->"gg")))
  def pattern_mutching_type(x : Any) : String = x match {
    // 1.constatnt pattern
    case 0 => "zero"
    case true => "true"
    case "hello" => "hello"
    case null => "null"

    // 2.constructor pattern
      //le pattern matching des constructeurs permet de matcher le constructeur utilisé lors de la creation de l'objet
      //il faut que la classe soit un case classe pour faire le constructor pattern
    case Personne("kouki" , x)=>  "xxxxxxxxx"
    case Personne(y , "ismahan")=>  "yyyyyyyyy"
    //case Personne("haroun")=>  "yyyyyyyyy"
    case Cercle(2) =>  "zzzzzzzzz"
    // 3.sequence pattern,
    case List(0, _, _) => "a three-element list with 0 as the first element"
    case List(1, _*) => "a list beginning with 1, having any number of elements"
    case Vector(1, _*) => "a vector starting with 1, having any number of elements"
    // 4.tuple pattern,
    case (a, b) => s"got $a and $b"
    // 5.or type pattern.
    case (a, b, c) => s"got $a, $b, and $c"
    case s: String => s"you gave me this string: $s"
    case i: Int => s"thanks for the int: $i"
    case f: Float => s"thanks for the float: $f"
    case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
    case as: Array[String] => s"an array of strings: ${as.mkString(",")}"
    case d: Cercle => s"cercle de rayon : ${d.rayon}"// cercle est un object
    case list: List[_] => s"thanks for the List: $list"
    case m: Map[_, _] => m.toString
    case _ => "inconnue"

  }
  //creer des case class
  //une case class est une calsse particuliere quand utilise generalement dans le pattern matching
  case class Personne(first_name : String ,last_name: String ){

  }
  //declaration d'un constructeur auxiliaire dans l'objet compagnon
  object Personne {
    def apply(name1 : String)  : Personne = new Personne(name1,"")
  }
  case class Cercle(rayon : Int)
}
