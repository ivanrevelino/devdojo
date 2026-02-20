package maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    static void main(String[] args) {
        // Vai manter a orderm mas nao necessariamente quando vc ti
        // Vc adiciona os valores, nao siginifica que os valores vao estar ordenados dentro do Heap, entao quando voce remove, ele remove conforme a forma de indercao

        Queue <String> fila = new PriorityQueue<>();
        fila.add("D");
        fila.add("B");
        fila.add("C");
        fila.add("A");

       while (!fila.isEmpty()) {
           System.out.println(fila.poll());
       }

    }
}
