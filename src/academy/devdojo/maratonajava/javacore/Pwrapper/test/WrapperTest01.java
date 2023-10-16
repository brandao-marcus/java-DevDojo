package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //Tipos primitivos sao relacionados ao tamanho. **
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'M';
        boolean booleanP = false;

        //Classes sendo utilizadas para representar os tipos primitivos.
        //Wrappers sao relacionadas ao polimorfismo. **
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // autoboxing => é quando transforma do tipo primitivo para wrapper.
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'M';
        Boolean booleanW = false;

        int i = intW; // unboxing => é quando transforma o wrapper para tipo primitivo.
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TrUe");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLetterOrDigit('M'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
