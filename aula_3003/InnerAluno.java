class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class innerAluno {
    public static void main(String[] args) {
        Aluno p = new Aluno("abel", 30);
        System.out.println("OIII" + p.nome);
    }

}