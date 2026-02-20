package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {


    static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Stivanzin Mbilane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(4L, "Jujutsu Kaisen", 19.9);
        Manga manga2 = new Manga(1L,"Pokemon", 9.5);
        Manga manga3 = new Manga(3L,"Dragon Ball Z", 3.2);
        Manga manga4 = new Manga(2L,"Attack On Titan", 11.20);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga3, manga4);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("----" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("----------" + manga.getNome());
            }

        }
    }


}
