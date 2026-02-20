package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 19.9));
        mangas.add(new Manga(1L,"Pokemon", 9.5));
        mangas.add(new Manga(3L,"Dragon Ball Z", 3.2));
        mangas.add(new Manga(2L,"Attack On Titan", 11.20));
//        Collections.sort(mangas);
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(3L,"Dragon Ball Z", 3.2);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, new MangaByIdComparator()));

    }
}
