package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("-----------------------------");
        System.out.println("Professor: "+this.nome);
        if(this.seminario == null) return;
        System.out.println("-- Seminarios cadastrados -- ");
        for (Seminario seminario : this.seminario) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if(seminario.getAlunos() == null) continue;
            System.out.println("-- Alunos --");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+aluno.getNome()+" idade: " + aluno.getIdade());
            }
            System.out.println("-----------------------------");

        }

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
