package maratonajava.javacore.Lclassesabstratas.test;

import maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main() {
        Gerente gerente = new Gerente("Nani", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
