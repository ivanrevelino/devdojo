package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import maratonajava.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComException {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
