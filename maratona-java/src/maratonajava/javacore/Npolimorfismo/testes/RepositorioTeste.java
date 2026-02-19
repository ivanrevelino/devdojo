package maratonajava.javacore.Npolimorfismo.testes;

import maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoMemoria;

public class RepositorioTeste {
    static void main(String[] args) {
        Repositorio repositorio= new RepositorioBancoMemoria();
        repositorio.salvar();
    }
}
