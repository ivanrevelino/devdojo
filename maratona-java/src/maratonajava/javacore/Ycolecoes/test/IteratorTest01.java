package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    static void main(String[] args) {

        // LinkedList => Um array onde cada uma das pos do array sabe da posicao anterior e da proxima
        // Vantagem e que ele e melhor pra remover

        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(4L,"Jujutsu Kaisen", 19.9, 0));
        mangas.add(new Manga(1L,"Pokemon", 9.5, 5));
        mangas.add(new Manga(3L,"Dragon Ball Z", 3.2, 0));
        mangas.add(new Manga(2L,"Attack On Titan", 11.20, 2));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);

    }
}
