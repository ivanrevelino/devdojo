package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Escola;
import maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya Sensei");
        Professor professor02 = new Professor("Kakashi Sensei");
        Professor professores[] = {professor01, professor02};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
