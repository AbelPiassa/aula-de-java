 class Aluno {
    String nome;
    int idade;
}

class funcionario extends Aluno {
    Double salario;
}

public class Aluno{
    public static void main(String[] agrs){

        Funcionario funcionario = new funcionario();

        Funcionario.nome = "Abel";
        Funcionario.idade = 30;
        Funcionario.salario = 10.000;

        System.out.println("nome: ", + Funcionario.nome);
        System.out.println("nome: ", + Funcionario.idade);
        System.out.println("nome: ", + Funcionario.salario);

    }
    }


    
