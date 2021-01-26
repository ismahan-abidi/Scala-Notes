package tuto8.objects

object ObjectCasting extends App {
  //cast permet de convertir un type d'une instance  à un autre type
  //on peut caster une instance (de type fils) à un type d'une classe parent , l'inverse est faux
  class A {
    def f = println("je suis une méthode de la classe A")
  }
  class B extends A
  val b = new B
 // b.f
  val a =b.asInstanceOf[A]
  a.f
  val a1 = new A
  //val b1=a1.asInstanceOf[B] //il va afficher un erreur lors de l'exécution car on ne peut pas caster une instance de type parent à un typr fils
  val x = 1.5
  val y =x.asInstanceOf[Int]
  println(y)
  val z = 5
  val w = z.asInstanceOf[Float]
  println(w)
}
