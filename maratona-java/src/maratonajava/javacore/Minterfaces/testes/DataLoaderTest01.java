package maratonajava.javacore.Minterfaces.testes;

import maratonajava.javacore.Minterfaces.dominio.DataLoader;
import maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
