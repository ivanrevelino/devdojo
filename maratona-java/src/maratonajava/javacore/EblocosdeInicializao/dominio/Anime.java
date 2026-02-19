package maratonajava.javacore.EblocosdeInicializao.dominio;

public class Anime {
    private String nome;
    private int episodios[];
    //1 - Alocado esoaci em memoria
    //2 - Cada atributo de classe e criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicializacao e executado
    //4 - Contrutor e executado
    {
        System.out.println("Dentro do bloco de inializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    /*Um bloco de inicializacao de intancia. Que vai ser executado toda vez que eu criar uma instancia desse objecto, nesse caso do objecto Anime e ele e executado antes do contructor */

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
