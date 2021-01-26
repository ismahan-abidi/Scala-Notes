package tuto11.implicits

object Math {
// on utilise implicit si on a plusieeur méthodes qui utilise la meme variable
  //ici on a fait object et pas class car on n'a pas fait un objet dans le main
  def add(a: Int)(implicit b: Int): Int = a + b

}


/*
class Math {
  // on utilise implicit si on a plusieeur méthodes qui utilise la meme variable
  //ici on a fait object et pas class car on n'a pas fait un objet dans le main
  def add(a: Int)(implicit b: Int): Int = a + b

}*/
