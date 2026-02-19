package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListaJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".java")) {System.out.println(file.getFileName());}

        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListaJavaFiles());




        /*WalkFileTree(path, FileVisitor)
        * path => precisa de um path para startar ou seja aonde vc quer comecar a procurar
        * FileVisitor => define o comportamento doque voce quer fazer quando voce esta a navegar pelo directorio*/


    }
}
