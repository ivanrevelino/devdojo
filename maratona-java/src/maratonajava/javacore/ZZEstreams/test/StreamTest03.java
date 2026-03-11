package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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


        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        long count = stream
                .distinct() // resumindo ele remove os itens repetidos baseados no equals e hashCode
                .filter(ln -> ln.getPrice() < 4)
                .count();

        System.out.println(count);

    }
}


