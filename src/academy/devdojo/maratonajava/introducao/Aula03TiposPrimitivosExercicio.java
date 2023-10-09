package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>.
 */


public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
    String nome = "Marcus";
    String endereco = "QND 15 CASA 18";
    double salario = 2500.24;
    String dataRecebimentoSalario = "11/09/2023";
    String relatorio = "Eu "+nome+", morando no endereco "+endereco+", confirmo que recebi o salario de R$: "+salario+", na data: "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
