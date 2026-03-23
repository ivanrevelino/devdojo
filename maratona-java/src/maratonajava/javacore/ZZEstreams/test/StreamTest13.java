package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Categoty;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static maratonajava.javacore.ZZEstreams.dominio.Promotion.*;

public class StreamTest13 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
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

        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                ));
        System.out.println(collect);

        // Map <Category, Map<Promotion, List<LightNovel>>>

        Map<Categoty, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoty,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE
                )));
        System.out.println(collect1);
    }
}
