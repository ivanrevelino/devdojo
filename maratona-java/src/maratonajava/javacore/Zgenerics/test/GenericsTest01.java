package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String itens : lista) {
            System.out.println(itens);
        }

        add(lista, new Consumidor("Midoriya"));

        for (Object itens : lista) {
            System.out.println(itens);
        }
    }


    public static void add (List list, Consumidor consumidor) {
        list.add(consumidor);
    }
}
