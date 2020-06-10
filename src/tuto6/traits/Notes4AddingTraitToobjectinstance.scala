package tuto6.traits

object Notes4AddingTraitToobjectinstance extends App {
  class A
  trait T {
    println("je suis un trait ")
  }
  // Rather than add a trait to an entire class, you just want to add a trait to an object instance
  //when the object is created.
  var a = new A() with T


}
