package maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    static void main(String[] args) {
    String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
    SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    System.out.println("Data: " + sdf.format(new Date()));
    }

}
