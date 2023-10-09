package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se o salario > 5000
        double salario = 8000;
        String mensagemDoar = "Eu vou doar 500tao pro DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ver!";

        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        // exemplo codigo limpo
        double salario2 = 6000;

        String resultador2 = salario2 > 5000 ? "Eu vou doar 500tao pro DevDojo" : "Ainda nao tenho condicoes, mas vou ver!";
        System.out.println(resultador2);

    }
}
