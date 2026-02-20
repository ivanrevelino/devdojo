package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;
import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    static void main(String[] args) {
        // Elas precisam que as classes que vc esta adicionando dentro dessa class TreeSet tenham Comparable
        // TreeSet automaticamente vai fazer a organizacao da sua colecao baseado no metodo compareTo() da classe
        // Usa quando a class que vc esta criadno a colecao implementa comparable

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

        mangas.add(new Manga(4L,"Jujutsu Kaisen", 19.9));
        mangas.add(new Manga(7L, "Bersek", 12.13));
        mangas.add(new Manga(1L,"Pokemon", 9.5));
        mangas.add(new Manga(3L,"Dragon Ball Z", 3.2));
        mangas.add(new Manga(2L,"Attack On Titan", 11.20));
        mangas.add(new Manga(2L,"Attack On Titan", 11.20));
        mangas.add(new Manga(5L,"Aaragon", 11.20));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(7L, "Yuyu Hakusho", 8, 5);
        System.out.println(" ");
        System.out.println(mangas.lower(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // ele retorna e remove o primeiro item da lista
        System.out.println(mangas.pollLast()); // retorna e remove o ultimo item da lista

        // Digamos que vc quer organizar de descendente lista vc usa mangas.descendingSet()

        // METODOS PARA COMPARACAO
        // lower vai trazer oq e imediatamente o menor
        // floor
        // higher primeiro maior
        // ceiling

    }
}
