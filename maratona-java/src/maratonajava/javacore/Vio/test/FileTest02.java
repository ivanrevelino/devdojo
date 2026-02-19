package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Pasta criada: " + isDiretorioCriado);

        File fileArquivoDirectorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDirectorio.createNewFile();
        System.out.println("arquivo.txt criado: " + isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDirectorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado: " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenomeado);
    }
}
