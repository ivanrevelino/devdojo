package maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try {
            System.out.println();
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getAbsolutePath());
            System.out.println("isDirectory " + file.isDirectory());
            System.out.println("isFile " + file.isFile());
            System.out.println("isHidden " + file.isHidden());
            System.out.println("last modified " + new Date(file.lastModified()));
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
