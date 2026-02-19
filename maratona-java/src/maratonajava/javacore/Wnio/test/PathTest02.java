package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");//new File pasta
        if (Files.notExists(pastaPath)) {
            //Path pastaDirectory = Files.createDirectory(pastaPath);
        }
        Path subpastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path pastaDirectory = Files.createDirectories(subpastaPath);
        Path filePath = Paths.get(subpastaPath.toString(), "file.txt");

        if (Files.notExists(filePath)) {
            Path filePathCreated = Files.createFile(filePath);
        }

        /*Como que faz para copiar um arquivo, digamos que queremos copiar esse file.txt para fileRenamed.txt denttro da subpasta*/
        // source => a origem do filePath
        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        /*
        O filePath.getParent vai nos dar o directorio de onde o filePath foi criado que nesse caso e o subpastaPath...
        E nesse metodo Path.get() meio que so aceita Strings entao temos que o converter usando toString()
        E a seguir como segundo parametro colocamos o nome do arquivo copiado, tipo o nome do arquivo novo que foi copiado
         */
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

    }
}
