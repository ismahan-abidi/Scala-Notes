package tuto6.traits

object Notes3LimitingUseTrait  extends App {
 // on veux que les classes qui implementent un trait ne soient que les sous types(sous classe)d'un autre classe parent
  class A
  trait T {
    this: A =>
    //toutes les classes qui vont implémenter le trait T doivent etre de sous type de la classe A
  }
  class B extends A with T
  //class C extends T              //  Illegal inheritance, self-type C does not conform to A


  //toutes les classes et les traits  qui héritent le trait T1 doivent voir la signature de la methode f()
  trait T1 {
    this: { def f(s: String): Boolean } =>
  }
  class C extends T1{
    //si on ne met pas la methode f() on aura une erreur dans la classe C
    def f(s: String): Boolean = {
      val x = 3
      val y = 5
     y == x
      val z = 3
      z==x
    }
  }
  val c = new C
  println(c.f("imahan"))
}
