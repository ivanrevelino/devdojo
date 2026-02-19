package maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lascAccessTime: " + lastAccessTime);
        System.out.println("tamanho do arquivo: " + basicFileAttributes.size());
        System.out.println("------------------------");

        /*BasicFileAttributesView dao metodos que possiblilitam mexermos nos atributos*/
        FileTime newLastAcessTime = FileTime.fromMillis(System.currentTimeMillis()); //Pega a hora actual do sistema operacional

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        fileAttributeView.setTimes(lastModifiedTime, newLastAcessTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime" + lastModifiedTime);
        System.out.println("lascAccessTime: " + lastAccessTime);
    }
}
