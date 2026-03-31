class Pessoas {
    String nome;
    int idade;
}

class Aluno extends Pessoas {
    String curso;
}

public class Pessoa {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Abel";
        aluno1.idade = 30;
        aluno1.curso = "ADS";

        System.out.println(aluno1.nome);
        System.out.println(aluno1.idade);
        System.out.println(aluno1.curso);

    }
}