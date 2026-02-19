package maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    static void main(String[] args) {
        String diretorioProjecto = "home/wiliam/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjecto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./wiliam/./dev");
    }
}
