package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.dominio.Carro;
import maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));






        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Supra MK4"), new Carro("Mark X")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);





        Carro carro = rentalService.buscarObjectosDisponivel();
        System.out.println("Usando carro por 1 mes...");
        rentalService.retornarObjectoAlugado(carro);

        //A mesma coisa para Barco

    }
}
