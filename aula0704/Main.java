class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;

    }

    public void setIdade(int idade){

        if (idade >= 0) {
            this.idade = idade;
            System.out.println("Sua idade é: " + idade);
        }else{
            System.out.println("Idade Invalida");
        }
            
        this.idade = idade;
    }

}

public class Main{
    public static void main(String[] args) {

        Aluno pessoa = new Aluno();

        pessoa.setNome("Abel");
        pessoa.setIdade(30);

        System.out.println(pessoa.getNome() +  " " + pessoa.getIdade());
    }
}