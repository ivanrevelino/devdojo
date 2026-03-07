package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjecto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
    }

    private static <T> List <T> criarArrayComUmObjecto(T t) {
        return List.of(t);
    }

//    private static <T extends Comparable> List <T> criarArrayComUmObjecto(T t) {
//        return List.of(t);
//    }
}
