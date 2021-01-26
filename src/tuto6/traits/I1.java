package tuto6.traits;

public interface I1 {
    void f1();
    public static void g(){
        System.out.println("je suis une méthode  g static donc implémenté dans un interface (depuis java 8 )");
    }
    public default void h(){
        System.out.println("je suis une méthode h default donc implémenté dans un interface (depuis java 8 ) ");
    }

    }

