package maratonajava.javacore.Npolimorfismo.testes;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        //Computador
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        double impostoComputador = produto.calcularImposto();
        System.out.println(impostoComputador);


        System.out.println("=========");

        //Tomate
        Produto produto2 = new Tomate("Tomate Americano", 30);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        double impostoTomate = produto2.calcularImposto();
        System.out.println(impostoTomate);

    }
}
