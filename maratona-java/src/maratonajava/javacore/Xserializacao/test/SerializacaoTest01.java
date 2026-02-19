package maratonajava.javacore.Xserializacao.test;

import maratonajava.javacore.Xserializacao.dominio.Aluno;
import maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Adberto", "1224");
        Turma turma = new Turma("Maratona Java Virado no Jiraya em Breve Ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
