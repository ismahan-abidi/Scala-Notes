package tuto5.classes

object Notes2Visibilities {
  //si l'attribut est var et non private, le compilateur va générer les getters et les setters
  class Person21(var firstName: String, var lastName: String)
  //if the field is a val => it should have an accessor(getter) method, and should not have a mutator(setter) method
  class Person22(val firstName: String, val lastName: String)
  // the visibility of the field becomes very restricted, and Scala doesn’t generate accessor or mutator methods
  class Person23(firstName: String, lastName: String)
  // Case class constructor parameters are val by default, you can still access the field, it differs from Person23
  case class Person24(firstName: String, lastName: String)
  //This keyword "private" prevents(interdict) getter and setter methods from being generated(we have to adding manually)
  class Person25(private var firstName: String, private var lastName: String){
    def setFirstName(x : String) = {firstName = x}
  }
  class Person26(private val firstName: String, private val lastName: String)
}
