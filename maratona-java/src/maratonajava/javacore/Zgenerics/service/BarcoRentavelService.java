package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando Barco Disponivel.....");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco " + barco);
        System.out.println("Carros Disponiveis para alugar: \n" + barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo Barco: " + barco);
        barcosDisponiveis.add(barco);
        System.out.println(barcosDisponiveis);
    }
}
