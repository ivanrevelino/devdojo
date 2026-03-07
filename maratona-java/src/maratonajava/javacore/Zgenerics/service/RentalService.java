package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objectosDisponiveis;

    public RentalService(List<T> objectosDisponiveis) {
        this.objectosDisponiveis = objectosDisponiveis;
    }

    public T buscarObjectosDisponivel() {
        System.out.println("Buscando Objectos Disponiveis.....");
        T t = objectosDisponiveis.remove(0);
        System.out.println("Alugando Objectos " + t);
        System.out.println("Objectos Disponiveis para alugar: \n" +  objectosDisponiveis);
        return t;
    }

    public void retornarObjectoAlugado(T t) {
        System.out.println("Devolvendo Objectos: " + t);
        objectosDisponiveis.add(t);
        System.out.println("Objectos Disponiveis para alugar");
        System.out.println(objectosDisponiveis);
    }
}
