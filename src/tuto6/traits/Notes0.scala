package tuto6.traits

object Notes0 {
  def main(args: Array[String]): Unit = {}

  //trait dans scala comme  les interfaces en java
  trait BaseSoundPlayer {
    def play
    def close
    def pause
    def stop
    def resume
    def methodeImplemente { println("je suis une méthode dans un trait mais implémentée")}
  }
  //il ya des methodes abstract dans les traits mais on n'ecrit pas le mot abstract just "def nomMethode (parametres si existent)
  trait Dog {
    def speak(whatToSay: String) :Unit
    def wagTail(enabled: Boolean)
  }
  //si un class herite un trait on utilise le mot clé extends
  //si un class hérite un classe et plusieurs trait on utilise pour le premier classe "extends" puis "with"
  //exmple: class Foo extends Trait1 with Trait2 with Trait3 with Trait4 { ...
  //si le class n'est pas abstrait alos il va implémenter toutes les methodes abstraites de trait
  class Mp3SoundPlayer extends BaseSoundPlayer {
    def play { // code here ...
    }
    def close { // code here ...
    }
    def pause { // code here ..
    }
    def stop { // code here ...
    }
    def resume { // code here ...
    }
  }
  //si la classe qui extend le trait n'implemente pas les methodes abstraites alors ce classe est necessairement abstract
  abstract class SimpleSoundPlayer extends BaseSoundPlayer {
    def play {}
    def close {}
  }
  //un trait peut aussi hériter un autre trait
  //si la classe hérite un autres classe ou bien un abstract classe et des traits on utilise toujours extends devant
  //le nom du classe et apres with devant chaque trait
  //on peut trouver des methodes implimentées dans les traits pas comme les interface toutes les methodes sont abstaites(
  // sauf au java 8 les methodes default et static sont implémentées)
  //dans un trait on peut trouver abstract fields (attribut non initialisés) or concrete fields (attribut initialisés)
  trait PizzaTrait {
    //dans les traits les attributs sont des val ou var
  var numToppings: Int  // abstract
  var size = 14         // concrete
  val maxNumToppings = 10  // concrete

}
  class Pizza extends PizzaTrait {
    //on n'a pas besoin d'ecrire override pour remplacer un champ var dans une sous-classe (ou trait), mais c'est
    //obligatoire de l'utiliser pour remplacer un champ val:
    var numToppings = 5  // 'override' not needed
    size = 18           // 'var' and 'override' not needed      override var size = 18
    override val maxNumToppings = 11  // 'override' and  'val'  are required
    // maxNumToppings normalement val cad cte pourquoi on a changer sa valeur
    // traits peuvent avoir des méthodes  abstraites  et des méthodes implémentées //il n'ya pas la notion de static et default dans scala
    //dans scala et java class abstract contient des méthodes abstract et des méthode non abstract
  }








}


