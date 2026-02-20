package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        //De ArrayList para Array
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));
        System.out.println("___________________________");
        Integer [] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayTolist = Arrays.asList(numerosArray); //Cria um link entre o Array original com o List
        arrayTolist.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayTolist);

        System.out.println("___________________________");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray)); // Conversao de Array para List
        numerosList.add(15);
        System.out.println(numerosList);

        List<Integer> list = Arrays.asList(1, 2, 3, 4); // Forma de insercao de elementos no Array
    }
}
