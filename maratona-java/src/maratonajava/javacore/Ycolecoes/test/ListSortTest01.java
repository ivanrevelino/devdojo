package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Jujutsu Kaisen");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball Z");
        mangas.add("Attack On Titan");
        Collections.sort(mangas); //Vai reorganizar na ordem Alfabetica, Se for uma lista de Inteiros ele vai ordenar

        List <Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.21);
        dinheiros.add(12.21);
        dinheiros.add(190.21);

        for (String manga: mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);

        Collections.sort(dinheiros);

        System.out.println(dinheiros);

        new Manga(null, null, 0);
    }
}
