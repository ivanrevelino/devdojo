package maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime(){
        System.out.println("Imprimindo...");
    }
}


/*
    Metodos abstratos nao tem corpo, e uma vez que ele existe eu sou obrigado a aplicar o metodo em todas as subclasses e uma classe abstrata nao pode ser instanciada... Ela deve ser extendida
*/