package tuto0.notes;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String name = "James gosling";
        System.out.println( name.replace('g', 'G') );

        System.out.println(name);
        int a = 5;
        //on java on trouve la notion de ternary operartion  (condition ternaire) :
        // c'est une ecriture reduite de if else ou ? remplace if et : remplace eslse
        int b = a < 15 ? 2 : 0;
        System.out.println(b);
        String nom = "abidi";
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
    }
}
