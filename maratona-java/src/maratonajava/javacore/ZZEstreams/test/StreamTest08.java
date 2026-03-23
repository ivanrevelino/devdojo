package maratonajava.javacore.ZZEstreams.test;


import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {

    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Over Lord", 3.99),
            new LightNovel("Violet EverGarnen", 5.99),
            new LightNovel("No Game no life", 4.99),
            new LightNovel("Fullmetal Alchemist", 1.99),
            new LightNovel("Kumo desuga", 2.99),
            new LightNovel("Kumo desuga", 2.99),
            new LightNovel("Monogatari", 8.99)))
            ;

    public static void main(String[] args) {

        // soma de todos lightNovels com valor acima de 3
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum).ifPresent(System.out::println);

        double doubleStream = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
    }
}
