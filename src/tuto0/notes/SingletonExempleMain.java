package tuto0.notes;

public class SingletonExempleMain {
    public static void main(String[] args) {
        // recuperation de l'objet singleton
      SingletonExemple se1 = SingletonExemple.getSingletonObject();
      SingletonExemple se2 = SingletonExemple.getSingletonObject();
      //puisqu'on n'a pas pas fait overriding de la methode toSring donc cette derniere va nous afficher l'adresse memoire de l'objet
        System.out.println(se1);
        System.out.println(se2);

    }
}
