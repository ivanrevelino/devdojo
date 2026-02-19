package maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


/*Constantes no Java => tudo em UpperCase... se tiver varias palavras deve ser separados por underline(_)

Uma vez criada uma constante no java o seu valor nao podera ser alterado*/