 class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

        if( idade < 0){
            System.out.println("Sua idade é negativo");
        } else{
            System.out.println("Sua idade é positivo");
        }
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade; 
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public class Exercicio1{
        public static void main(String[] args) {
            Pessoa p1 = new Pessoa("Abel", -30);

            System.out.println(p1.getNome() + " " + p1.getIdade());
        }
    }
    
}
