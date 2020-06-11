package tuto9.functional.programming

object Notes3FunctionAsMethodParameter extends App {
  //on peut passer une fonction comme un paramètre pour une méthode
  // la meéthode executeFunction prend en paramètre une fonction paramètre, cette fonction ne prend aucun paramètre et ne retourne aucune valeur
  def executeFunction(callback: () => Unit) {
    callback()
  }

  val f = () => println("je suis la fonction f sans paramètre et sans type de retour")
  val g = () => println("je suis la fonction g sans paramètre et sans type de retour")
  executeFunction(f)
  executeFunction(g)
// Le syntaxe pour créer une fonction paramètre dans une méthode est le suivant : fonctionParamName : (type1 ,type2 ...) => typeResult
  def mathematicsOperation(h:(Int,Int) => Int, x :Int, y :Int): Unit = {
    val result = h(x,y)
    println(result)
  }

  val add = (x:Int,y:Int) => x+y
  val multiplication =  (x:Int,y:Int) => x*y
  val soustraction  =  (x:Int,y:Int) => x-y

  mathematicsOperation(add, 2,7)
  mathematicsOperation(multiplication, 2,5)
  mathematicsOperation(soustraction, 20,15)

}
