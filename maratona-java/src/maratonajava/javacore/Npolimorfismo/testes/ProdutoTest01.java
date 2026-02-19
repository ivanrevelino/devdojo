package maratonajava.javacore.Npolimorfismo.testes;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Sciciliano", 10);
        Televisao tv = new Televisao("Samsung 50\"", 50000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("= = = = = = = = = = = = = =");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("= = = = = = = = = = = = = =");
        CalculadoraImposto.calcularImposto(tv);
    }
}
