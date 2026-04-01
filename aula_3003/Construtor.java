class Pessoa {
    String nome;
    int idade;

    public Pessoa (String nome, int idade) { //construtor
        this.nome = nome;
        this.idade = idade;
    }
}


public class Construtor {
    public static void main(String[] args) {
        
        Aluno p = new Aluno("Maria", 25);
        System.out.println("ola mundo " + p.nome );
    }

}