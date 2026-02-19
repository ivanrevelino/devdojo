package maratonajava.javacore.Npolimorfismo.testes;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main(String[] args) {
        //Computador
        Produto produto = new Computador("Ryzen 9", 3000);

        //Tomate
        Tomate tomate = new Tomate("Tomate Americano", 30);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("= = = = = = = = = = =");
        CalculadoraImposto.calcularImposto(produto);


    }
}
