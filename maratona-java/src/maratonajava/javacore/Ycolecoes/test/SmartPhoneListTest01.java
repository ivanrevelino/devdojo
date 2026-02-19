package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneListTest01 {
    static void main(String[] args) {

        Smartphone s1 = new Smartphone("1AB2", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>(6);

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone: smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("22222", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartPhone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartPhone4));

    }
}
