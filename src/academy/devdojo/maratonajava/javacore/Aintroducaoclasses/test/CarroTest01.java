package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominioVIDAREAL.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Citroen C4";
        carro1.modelo = "Hatch";
        carro1.ano = 2011;

        carro2.nome = "Hyundai Santa Fe";
        carro2.modelo = "Camioneta";
        carro2.ano  = 2012;

        System.out.println("Carro 01");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n--------------\n");

        System.out.println("Carro 02");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
