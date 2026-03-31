import java.util.ArrayList;

class aluno{
    String nome;
    int idade;

    void chamada(){
        System.out.println("Sua idade é: " + nome);
        System.out.println("Sua idade é: " + idade);
    
    }
    public void main(String[] args) {
        ArrayList<aluno> alunos = new ArrayList<>();

        aluno aluno1 = new aluno();
        aluno1.nome = "Abel";
        aluno1.idade = 30;


        aluno aluno2 = new aluno();
        aluno2.nome = "joao";
        aluno2.idade = 32;

        aluno aluno3 = new aluno();
        aluno3.nome = "piassa";
        aluno3.idade = 33;


        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        
        for(aluno a: alunos){
            System.out.println(a.nome);
        }


    }

}