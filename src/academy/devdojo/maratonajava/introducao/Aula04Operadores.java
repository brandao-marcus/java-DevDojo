package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        // inteiro com inteiro = resultado inteiro
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 / numero02;

        // inteiro com double = resultado fracionado
        int numero03 = 10;
        double numero04 = 20;
        double resultado2 = numero03 / numero04;

        System.out.println(resultado);
        System.out.println(resultado2);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != (retornam valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("10 > 20??? "+isDezMaiorQueVinte);
        System.out.println("10 < 20??? "+isDezMenorQueVinte);
        System.out.println("10 == 20??? "+isDezIgualAVinte);
        System.out.println("10 == 10??? "+isDezIgualADez);
        System.out.println("10 != 10??? "+isDezDiferenteDeDez);

        // &&(AND) , ||(OR) , !(NOT)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        double bonus2 = 1800;
        bonus2 -= 1000;
        System.out.println(bonus2);

        double bonus3 = 1800;
        bonus3 *= 2;
        System.out.println(bonus3);

        double bonus4 = 1800;
        bonus4 /= 2;
        System.out.println(bonus4);

        double bonus5 = 1800;
        bonus5 %= 2;
        System.out.println(bonus5);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);



    }
}
