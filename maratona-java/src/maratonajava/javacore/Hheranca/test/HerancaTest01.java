package maratonajava.javacore.Hheranca.test;

import maratonajava.javacore.Hheranca.dominio.Endereco;
import maratonajava.javacore.Hheranca.dominio.Funcionario;
import maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01201-21324");
        Pessoa pessoa = new Pessoa("Kokushibo");
        pessoa.setCpf("121323");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Ban");
        funcionario.setCpf("1232");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(90000);
        funcionario.imprime();
    }
}
