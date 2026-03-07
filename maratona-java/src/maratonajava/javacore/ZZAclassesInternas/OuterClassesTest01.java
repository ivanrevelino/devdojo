package maratonajava.javacore.ZZAclassesInternas;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    //Nested
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // esse this faz referencia da classe interna
            System.out.println(OuterClassesTest01.this); // esse OuterClass.this faz referecia para o OuterClassTest01
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01(); // OuterClass
        Inner inner = outerClass.new Inner(); // Forma de criar uma classe interna
        Inner inner2 = new OuterClassesTest01().new Inner(); // Outra forma
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }

}
