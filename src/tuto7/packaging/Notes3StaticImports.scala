package tuto7.packaging

object Notes3StaticImports extends App {
  //comme java on peut importer les membres statiques d'une classe mais sans utiliser le mot clé static DEVANT IMPORT
  import java.lang.Math._

  println(cos(0))
  println(PI)
  //SCOPE : La visibilité d'une méthode , d'un attribut , d'une classe, ...

}
