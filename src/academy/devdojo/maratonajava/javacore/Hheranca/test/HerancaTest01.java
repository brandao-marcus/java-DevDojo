package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua QND 15");
        endereco.setCep("72120-150");
        Pessoa pessoa = new Pessoa("Marcus Brandone");
        pessoa.setCpf("12345679");
        pessoa.setEndereco(endereco);
        System.out.println("----------------------");
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Daisy Almeida");
        funcionario.setCpf("10101011");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------------------");
        funcionario.imprime();
        System.out.println("----------------------");
    }
}
