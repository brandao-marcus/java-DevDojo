package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print() { //parametro tambem deve ser final
        String lastName = "Izuku"; //final
        //dois modificadores de acessos permitidos:
        // abstract class ou final class
        class LocalClass {
            public void printLocal() {
                System.out.println(name + " "+lastName);
            }
        }
        new LocalClass().printLocal();
        //unica forma de utilizar as classes locais.
        //deve-se instanciar essa classe diretamente no metodo.
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
