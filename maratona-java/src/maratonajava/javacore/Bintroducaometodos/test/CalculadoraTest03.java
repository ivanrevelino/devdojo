package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        //double resultado = calculadora.divideDoisNumeros(20, 0);
        //System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros2(20, 0));
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
