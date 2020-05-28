package tuto3.control.structures

object Notes7TernaryCondition {
  def main(args: Array[String]): Unit = {
    // On peut utiliser if else comme une opération ternaire en java
    val a = -2
    val absValue = if (a < 0) -a else a
    println(absValue)
    // parceque une opération ternaire est une expression qui retourne une valeur, on peut l'écrire  dans println
    println("-------------------------------")
    println( if (a < 0) -a else a)
    // On peut l'utiliser aussi dans n'importe quelle expression
    println("-------------------------------")
    val x = 5 + 3 * (if (a < 0) -a else a)
    println(x)
  }
}
