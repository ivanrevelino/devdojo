package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo oq nao for digitos
        // \s = todos os espacos em branco pode ser > \t \n \f \r
        // \S = todos os caracteres excluido os brancos
        // \w = tudo oq for de a-ZA-Z, todos os digitos, _
        // \W = tudo oq nao for incluso no \w
        // []
//        String regex = "[a-zA-C]";
        String regex = "[0[xX][0-9a-fA-F]]";
        //String text = "baba";
        String text2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("texto:  " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
