package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo
        byte dia = 4;
        // char, int, byte, short, enum e String.
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
        }

        char sexo = 'M';
        switch (sexo) {
            case 'H':
                System.out.println("Homem");
                break;
            case 'M':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
        



    }
}
