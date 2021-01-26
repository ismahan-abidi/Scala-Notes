package tuto6.traits

object Notes4AddingTraitToobjectinstance extends App {
  class A
  def g():Int = {
    val i=1
    val j = 2
   val x = i+j
    x
  }
  trait T {
    println("je suis un trait ")
    def f(i: Int):Boolean ={
      val x=5
      val y = 5
    x==y
    }
  }
  // Rather than add a trait to an entire class, you just want to add a trait to an object instance
  //when the object is created.
  var a = new A() with T // ici l'objet a hérite de la classe A et de trait T c'est un raccurci au lieu d'utliser un autre class B extends A with T
  println(a.f(2))
  println(g())



}
