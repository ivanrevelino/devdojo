package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Gullit");
        Jogador jogador3 = new Jogador("Cruyff");
        Jogador jogadores[] = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
