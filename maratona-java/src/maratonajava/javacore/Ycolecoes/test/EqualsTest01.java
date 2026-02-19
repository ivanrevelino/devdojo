package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1AB2", "iPhone");
        Smartphone s2 = new Smartphone("1AB2", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
