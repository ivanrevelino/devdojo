package maratonajava.javacore.Oexception.runtime.test;

public class RunTimeException01 {
    static void main(String[] args) {
        //Checked e Unchecked
        //Uncheked => o erro esta no codigo e nao precisa fazer validacao
        int nums[] = {0, 1};
        System.out.println(nums[2]);
    }
}
