package maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo oq nao for digitos
        // \s = todos os espacos em branco pode ser > \t \n \f \r
        // \S = todos os caracteres excluido os brancos
        // \w = tudo oq for de a-ZA-Z, todos os digitos, _
        // \W = tudo oq nao for incluso no \w
        // []
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de b ate m
        // () agrupamento
        // | o(v|c) ovo \ oco
        // $ fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
