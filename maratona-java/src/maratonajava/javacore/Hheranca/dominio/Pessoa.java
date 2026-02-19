package maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicializacao estatico de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de pessoa [1]");
    }

    {
        System.out.println("Dentro do bloco de inicializacao de pessoa [2]");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do contrutor pessoa");
        this.nome = nome;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
        System.out.println(" - - - - - - - - - - - - - - ");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
