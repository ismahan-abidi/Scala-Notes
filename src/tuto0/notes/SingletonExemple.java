package tuto0.notes;

// le design patter (patron de conception) singleton permet de créer un seul objet pour une classe
public final class SingletonExemple {
    // on met le constructeur private pour interdir d'instancier plusieur objets à l'exterieur
    private SingletonExemple() {

    }

    private static SingletonExemple singleton_object = null;

    public static SingletonExemple getObject() {
        if (singleton_object == null)
            singleton_object = new SingletonExemple();
        return singleton_object;
    }
}
