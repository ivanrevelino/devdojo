package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor();
        professor01.nome = "Mestre Kami";
        professor01.idade = 140;
        professor01.sexo = 'M';

        System.out.println("Nome: " + professor01.nome +  " idade: " + professor01.idade + " sexo: " + professor01.sexo);
    }
}
