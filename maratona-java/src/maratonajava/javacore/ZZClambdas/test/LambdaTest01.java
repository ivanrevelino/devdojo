package maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Ivan", "Revelino", "Kokushibo", "Zoro");
        List<Integer> integers = List.of(1, 2, 4, 5, 67, 8);
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, number -> System.out.println(number));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
