package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    static void main(String[] args) {
        String regex = "aba";
        //String text = "abaaba";
        String text2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("texto:  " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
