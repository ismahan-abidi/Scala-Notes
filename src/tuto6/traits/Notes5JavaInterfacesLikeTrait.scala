package tuto6.traits

object Notes5JavaInterfacesLikeTrait extends App {
  class K extends I1 with I2 with I3{
    def f1(){ println("je suis la méthode f1")}
    def f2(){ println("je suis la méthode f2")}
    def f3(){ println("je suis la méthode f3")}
  }
  //pour afficher les message décrit dans les methodes il faut créer un objet
  var obj = new K()
  obj.f1()
  obj.f2()
  obj.f3()

}
