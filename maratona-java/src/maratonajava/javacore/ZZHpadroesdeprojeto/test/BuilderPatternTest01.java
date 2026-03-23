package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {

        Person build = Person.PersonBuilder.builder()
                .firstName("Stivanzin")
                .lastName("Mbilane")
                .username("@stivanzin")
                .email("vascocebola02@gmail.com")
                .build();
        System.out.println(build);
    }
}
