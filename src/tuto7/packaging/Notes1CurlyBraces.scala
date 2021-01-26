package tuto7.packaging

import tuto7.packaging.orderentry.Foo


//on peut écrire plusieurs pakages dans le meme fichier scala
//c'est equivalent au namespaces(c++)
package orderentry {
  class Foo {
    override def toString = "I am orderentry.Foo"
  }
}

package customers {
  class Foo {
    override def toString = "I am customers.Foo"
  }
  package database {
    class Foo {
      override def toString = "I am customers.database.Foo"
    }
  }

}

object Notes1CurlyBraces extends App {
  //comme en java, si on met un objet dans la méthode println il va afficher le String dans la méthode toString
  println(new orderentry.Foo)
  println(new Foo)
  println(new Foo)
}
