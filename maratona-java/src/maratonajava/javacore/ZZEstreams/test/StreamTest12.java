package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Categoty;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {

    private static List<LightNovel> lightNovels= new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99, Categoty.FANTASY),
            new LightNovel("Over Lord", 3.99, Categoty.FANTASY),
            new LightNovel("Violet EverGarnen", 5.99, Categoty.DRAMA),
            new LightNovel("No Game no life", 4.99, Categoty.FANTASY),
            new LightNovel("Fullmetal Alchemist", 1.99, Categoty.FANTASY),
            new LightNovel("Kumo desuga", 2.99, Categoty.FANTASY),
            new LightNovel("Kumo desuga", 2.99, Categoty.FANTASY),
            new LightNovel("Monogatari", 8.99, Categoty.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Categoty, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoty));
        System.out.println(collect);
    }
}
