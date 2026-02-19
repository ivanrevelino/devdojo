package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Fusca Bala";
        carro01.modelo = "Sport";
        carro01.ano = 1969;

        carro02.nome = "Dodje";
        carro02.modelo = "Chalenger";
        carro02.ano = 2010;

        carro01 = carro02; //Carro1 faz referencia ao Carro 2, e as antigas informacoes seram substituidas com as informacoes do carro2

        System.out.println("nome: " + carro01.nome);
        System.out.println("modelo: " + carro01.modelo);
        System.out.println("idade: " + carro01.ano);
        
        System.out.println("\n nome: " + carro02.nome);
        System.out.println("modelo: " + carro02.modelo);
        System.out.println("ano: " + carro02.ano);
    }
}
