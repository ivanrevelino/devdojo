package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Stivanzin Mbilane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(4L, "Jujutsu Kaisen", 19.9);
        Manga manga2 = new Manga(1L,"Pokemon", 9.5);
        Manga manga3 = new Manga(3L,"Dragon Ball Z", 3.2);
        Manga manga4 = new Manga(2L,"Attack On Titan", 11.20);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
