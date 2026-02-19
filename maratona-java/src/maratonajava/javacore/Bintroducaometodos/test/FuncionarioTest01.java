package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        
        funcionario01.setNome("Vasco");
        funcionario01.setIdade(40);
        funcionario01.setSalarios(new double[]{1300, 500, 300});
        funcionario01.imprimeDados();
    }
}
