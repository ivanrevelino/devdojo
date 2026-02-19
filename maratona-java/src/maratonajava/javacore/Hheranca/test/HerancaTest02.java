package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicializacao estatico da superclasse e executado quando a JVM carregar a classe pai
    //1 - Bloco de inicializacao estatico da subclasse e executado quando a JVM carregar a classe filha
    //2 - Alocado espaco em memoria pro objecto da superclasse
    //3 - Cada atributo de superclasse e criado e inicializado com valores default ou o que for passado da classe
    //4 - Bloco de inicializacao da superclasse e executado na ordem em que aparece
    //5 - Contrutor e executado da subclasse
    //6 - Alocado espaco em memoria pro objecto da subclasse
    //7 - Cada atributo de subclasse e criado e inicializado com valores default ou o que for passado
    //8 - Bloco de inicializacao da subclasse e executado na ordem em que aparece
    //9 - Contrutor e executado da subclasse


    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Kokushibo");
    }
}
