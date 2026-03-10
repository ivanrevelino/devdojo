package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {

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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
