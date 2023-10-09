package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dado os valores de 1 a 7, imprima se e dia util ou final de semana
        // Considerando 1 como domingo
        byte dia = 7;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
