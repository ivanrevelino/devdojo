package maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double salarios[];
    private double media;
    
    public void imprimeDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            System.out.print(salario + ", ");
        }

        mediaSal();
    }

    public void mediaSal() {
        if (salarios == null) {
            return;
        }
        
        for (double salario : salarios) {
            media += salario;
        }

        media /= salarios.length;
        System.out.println("Media Salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }
    
    public double[] getSalarios() {
        return salarios;
    }
}
