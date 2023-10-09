package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if(isAutorizadoComprarBebida != false)  {
            System.out.println("Autorizado a comprar bebida alcoolica");
        }else{
            System.out.println("Nao autorizado a comprar bebida!");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Nao autorizado a comprar bebida!");
        }

       /* Nao e usado.

          boolean c = false;
        if(c = true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        */

        System.out.println("Fora do if");
    }
}
