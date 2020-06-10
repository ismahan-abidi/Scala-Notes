package tuto6.traits

class Notes3LimitingUseTrait {
 // on veux que les classes qui implemente un trait ne soit que les sous types(sous classe)d'un autre classe parent
  class A
  trait T {
    this: A =>
    //toutes les classes qui vont implémente le trait T doivent etre de sous type de la classe A
  }
  class B extends A with T
  //class C extends T              //  Illegal inheritance, self-type C does not conform to A


  //toutes les classes et les traits  qui héritent l'inerface T1 doivent voire la signature de la methode f()
  trait T1 {
    this: { def f(password: String): Boolean } =>
  }
  class C extends T1{
    //si on ne met pas la methode f() on aura une erreur dans la classe C
    def f(password: String): Boolean =true
  }
}
