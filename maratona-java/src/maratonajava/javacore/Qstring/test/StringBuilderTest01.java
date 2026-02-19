package maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "Stivanzin";
        nome.concat(" DevMbilane");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Ivan Mbilane");
        sb.append(" DevIvan");
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
