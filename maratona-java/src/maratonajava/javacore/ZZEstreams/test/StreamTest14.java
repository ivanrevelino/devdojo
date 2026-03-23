package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Categoty;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest14 {

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

        Map<Categoty, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoty, Collectors.counting()));
        System.out.println(collect);

        Map<Categoty, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoty, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Categoty, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoty,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Categoty, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategoty, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
