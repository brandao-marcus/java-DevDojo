package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

// Classe externa
public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";


    // Classe interna
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); //this refere-se ao objeto interno.
            System.out.println(OuterClassesTest01.this); //dessa forma refere-se ao objeto externo.
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasse = new OuterClassesTest01();
        Inner inner = outerClasse.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
