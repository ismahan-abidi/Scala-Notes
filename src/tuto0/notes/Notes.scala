package tuto0.notes

object Notes {

  //l'autre projet scala-Notes dans le home
  def main(args: Array[String]): Unit = {
    //object est l'equivalent d'une classe en java ou tout les attributs et les methodes sont statiques
    // pour creer une constante on utilise le mot "val"
    //pour creer un variable on utilise le mot var
    //on precise le type juste apres le nom du variable
    // le ; n'est pas obligatoire (facultatif)
    //ctr+shift+alt+j pour modifier un mots dans plusieurs emplacement
    val prenom : String = "ismahan"
    var nom : String = "abidi"
    nom = "kouki"
    //type inference: scala peut detecter le type lors de l'initialisation du variable
    val age = 5

  }

}
