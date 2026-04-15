import java.util.Scanner;

class Aluno {
    private String nome;
    private double nota;
    

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;

          if (nota >= 0 && nota <= 10) {
            System.out.println("Sua nota é valida");
        }else{
            System.out.println("Nota invalida");
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getNota(){
        return nota;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua nota para validação: ");
        double nota = input.nextDouble();

        Aluno a  = new Aluno(nome, nota);        
        System.out.println("sua nota:  " +  a.getNota());

        input.close();
    }    
}


