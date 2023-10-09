package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    //constante nao pode ter o valor alterado, uma vez q o valor foi setado.
    //geralmente vai vir acompanhado do metodo static.
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();


    public final void  imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
