package tuto0.notes;

// le design pattern (patron de conception) singleton permet de créer un seul objet pour une classe
public final class SingletonExemple {
    // on met le constructeur sans parametre private pour interdir d'instancier aucun objets à l'exterieur
    private SingletonExemple() {
    }
    //creation d'une variable static de type meme class
    private static SingletonExemple singleton_object = null;
    //creation d'une methode static getSingletonObject()
    public static SingletonExemple getSingletonObject() {
        if (singleton_object == null)
            singleton_object = new SingletonExemple();
        return singleton_object;
    }


}
