package maratonajava.javacore.Jmodificadorfinal.test;

import maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
