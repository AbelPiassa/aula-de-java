
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {
    private String nome;
    private int RA;

    public Aluno(String nome, int RA) {
        this.nome = nome;
        this.RA = RA;
    }

    public String getNome() {return nome;}
    public int getRA() {return RA;}

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " - RA: " + RA);
    }

}

class Uniface {
    private List<Aluno> listaAlunos;

    public Uniface() {
        this.listaAlunos = new ArrayList<>();
    }

    public void registrar(Aluno aluno) {
        listaAlunos.add(aluno);
        System.out.println("----- Aluno registrado!----- ");
    }

    public void exibirChamada() {
        System.out.println("\n-----Lista de Presença -----");

        for (Aluno aluno : listaAlunos) {
            aluno.exibirInfo();
        }
        System.out.println("--------------------------------");
    }

}

public class Exemplo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        Uniface sistema = new Uniface();

        System.out.println("\n---Bem vindo---");

        System.out.println("Digite o nome do Aluno: ");
        String nomelido = input.nextLine();

        System.out.println("Agora digite o RA do " + nomelido);
        int raLido = input.nextInt();

        Aluno novoAluno = new Aluno(nomelido, raLido);

        
        sistema.registrar(novoAluno);
        sistema.exibirChamada();

        input.close();
    }


}