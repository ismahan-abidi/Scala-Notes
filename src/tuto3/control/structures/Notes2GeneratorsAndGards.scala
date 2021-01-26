package tuto3.control.structures

object Notes2GeneratorsAndGards {
  def main(args: Array[String]): Unit = {
    // 1) to est une methode qui retourne un range
    for (i <- 1 to 3) println(i)
    println("*************")
    // 2) guard c'est le fait de faire une condition dans une boucle
    for (i <- 1 to 10 if i < 6) println(i)
    println("**************")
    //3) parcourir une collection Map
    val names = Map("fname" -> "Robert", "lname" -> "Goren","firstname"-> "abidi", "lastname" -> "ismahan")
    for ((k,v) <- names) println(s"key: $k, value: $v")
  }

}
