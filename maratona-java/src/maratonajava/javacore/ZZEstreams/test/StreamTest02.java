package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {

    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Over Lord", 3.99),
            new LightNovel("Violet EverGarnen", 5.99),
            new LightNovel("No Game no life", 4.99),
            new LightNovel("Fullmetal Alchemist", 1.99),
            new LightNovel("Kumo desuga", 2.99),
            new LightNovel("Monogatari", 8.99)))
            ;

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);
    }


}
