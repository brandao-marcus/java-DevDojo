package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 320000000000l;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0d;
        float salarioFloat = (float) 2500.0d;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 77;
        String nome = "Goku";

        System.out.println("A idade e "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+caractere);
        System.out.println(idade);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome e "+nome);

    }
}
