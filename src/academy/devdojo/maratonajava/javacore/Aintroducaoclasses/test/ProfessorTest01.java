package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominioVIDAREAL.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + " \nidade: " + professor.idade + " anos \nsexo: " + professor.sexo);
    }
}
