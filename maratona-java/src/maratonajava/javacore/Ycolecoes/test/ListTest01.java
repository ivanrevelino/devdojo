package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List <String> names = new ArrayList<>(); // 1.4
        List <String> names2 = new ArrayList<>(); // 1.4
        names.add("Ivan");
        names.add("Dev Dojo");
        names2.add("Mbilane");
        names2.add("Academy");
        names.addAll(names2);

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println("------------");
        int size = names.size();
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
