package maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 5467847086656604796L;

    private long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo viradao no Jiraya";
    private transient Turma turma;

    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Aluno(long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
