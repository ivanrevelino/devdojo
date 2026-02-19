package maratonajava.javacore.Npolimorfismo.servico;

import maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
