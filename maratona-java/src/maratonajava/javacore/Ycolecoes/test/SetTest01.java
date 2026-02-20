package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    static void main(String[] args) {

        Set<Manga>mangas = new LinkedHashSet<>();

        mangas.add(new Manga(4L,"Jujutsu Kaisen", 19.9));
        mangas.add(new Manga(1L,"Pokemon", 9.5));
        mangas.add(new Manga(3L,"Dragon Ball Z", 3.2));
        mangas.add(new Manga(2L,"Attack On Titan", 11.20));
        mangas.add(new Manga(2L,"Attack On Titan", 11.20));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
