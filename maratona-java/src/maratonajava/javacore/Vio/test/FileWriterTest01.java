package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//File Reader
//BufferedWriter
//BufferedReader
public class FileWriterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("O DevDojo e lindo, e o melhor curso de Java do Mundooooo\nContinuando a cantoria da proxima Linha\n");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
