package tuto11.implicits

import tuto11.implicits.Math.add


object Main {

  def main(args: Array[String]): Unit = {

    implicit val k: Int = 6

    println(add(2)(3)) // 5
    println(add(7)(3)) // 10

    println(add(1))
  }
}

/*package tuto13.implicits


object Main {

  def main(args: Array[String]): Unit = {
    val  m = new Math // si on fait class et pas object on crée un objet pour appeler les méthode et on n'a pas besoin d'importer le package
    implicit val k: Int = 6

    println(m.add(2)(3)) // 5
    println(m.add(7)(3)) // 10

    println(m.add(1))
  }
}*/
