package maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {

    public static void main(String[] args) {
        List<String> strings = List.of("Ivan", "Mbilane", "Kokushibo");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        foreach(integers, i -> System.out.println(i));
        foreach(strings, (String s) -> System.out.println(s));
    }

    private static <T> void foreach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
        }
    }
}
