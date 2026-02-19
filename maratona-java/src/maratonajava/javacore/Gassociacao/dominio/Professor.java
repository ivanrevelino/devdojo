package maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario seminarios[];


    //Construtores
    public Professor(String nome) {
        this.nome = nome;
    }
    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }
    public Professor(String nome, String especialidade, Seminario []seminarios) {
        this(nome);
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null) return;
        System.out.println("### Seminarios cadastrados ###");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno alunos : seminario.getAlunos()) {
                System.out.println("Aluno: " + alunos.getNome() + " Idade: " + alunos.getIdade());
            }
        }
    }

    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Especialidade
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    //Seminarios
    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }
}
