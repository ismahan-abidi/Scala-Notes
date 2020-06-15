package tuto0.notes;
import tuto0.notes.teststatic.TestImportStatic;
//on peut importer tout les membres statiques d'une classe on utilisant le mot clé static devant import sans utiliser classe.staticMethod
import static tuto0.notes.teststatic.TestImportStatic.*;

public class MainTestImportStatic {
    public static void main(String[] args) {
        TestImportStatic.staticf();
        staticf();
    }
}
