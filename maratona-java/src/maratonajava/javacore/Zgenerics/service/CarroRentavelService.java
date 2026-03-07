package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Supra MK4"), new Carro("Mark X")));

    public Carro buscarCarroDisponivel() {
        System.out.println("Buscando Carro Disponivel.....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando Carro " + carro);
        System.out.println("Carros Disponiveis para alugar: \n" +  carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo Carro: " + carro);
        carrosDisponiveis.add(carro);
        System.out.println(carrosDisponiveis);
    }
}
