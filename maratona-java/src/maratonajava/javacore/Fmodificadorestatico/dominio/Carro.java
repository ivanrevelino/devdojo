package maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){ 
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite =  velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    //Getter and Setter for nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter and Setter for velocidadeLimite

    //Getter and Setter for velocidadeMaxima
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
