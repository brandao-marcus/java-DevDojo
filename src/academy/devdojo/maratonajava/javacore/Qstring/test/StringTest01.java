package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {

        // String são imutáveis.

        String nome = "Marcus"; // String constant pools.
        String nome2 = "Marcus";
        nome = nome.concat(" Brandao"); // mesma coisa que: nome += " Brandao"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Marcus"); // 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
