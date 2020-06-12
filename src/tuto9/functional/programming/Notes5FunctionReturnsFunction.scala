package tuto9.functional.programming

object Notes5FunctionReturnsFunction  extends App {
  def sum(x :Int, y: Int) = x+y
  //une méthode retourne une autre fonction
  //l'expression avant l'égal c'est la signature de la méthode aprés l'= c'est l'implémentation de la fonction
  def saySomething(prefix: String)= (s: String) => {
    prefix + " " + s
  }

 val a = saySomething("hello") // (s:String)=> {"hello "+s }
 println(a("ismahan"))

}
