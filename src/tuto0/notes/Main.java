package tuto0.notes;

import tuto5.classes.Notes5PrivatePrimaryConstructor;

public class Main {
    public static void main(String[] args) {
        String name = "James gosling";
        System.out.println(name);
        System.out.println( name.replace('g', 'G') );
        int a = 3;
        //on java on trouve la notion de ternary operartion  (condition ternaire) :
        // c'est une ecriture reduite de if else ou ? remplace if et : remplace else
        int b = a < 15 ? 2 : 0;
        System.out.println(" la valeur de b est " + b);
        String nom = "kouki";
        switch (nom) {
            case "kouki" :
                System.out.println("nom = kouki");
                break;
            case "abidi" :
                System.out.println("nom = abidi");
                break;
            case "maddouri" :
                System.out.println("nom = maddouri");
                break;
            case "hannachi" :
                System.out.println("nom = hannachi");
                break;
        }
        Notes5PrivatePrimaryConstructor.f();
    }
}
