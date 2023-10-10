package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tapioca extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.08;
    public Tapioca(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto da tapioca");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
