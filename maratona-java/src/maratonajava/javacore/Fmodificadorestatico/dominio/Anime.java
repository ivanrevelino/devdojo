package maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int episodios[];
    // Bloco de inicializacao e executado quando a JVM carregar a classe
    //1 - Alocado espaco em memoria
    //2 - Cada atributo de classe e criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicializacao e executado
    //4 - Contrutor e executado
    static {
        System.out.println("Dentro do bloco de inializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    /*Um bloco de inicializacao de intancia, vai ser executado toda vez que eu criar uma instancia desse objecto, nesse caso do objecto Anime e ele e executado antes do contructor */

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {return nome;}

    public int[] getEpisodios() {return episodios;}

}