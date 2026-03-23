package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Categoty;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest15 {

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
        Map<Categoty, DoubleSummaryStatistics> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoty, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
        Map<Categoty, Set<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoty, mapping(StreamTest15::getPromotion, toSet())));
        Map<Categoty, Set<Promotion>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoty, mapping(StreamTest15::getPromotion, toCollection(LinkedHashSet::new))));
        System.out.println(collect1);
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
