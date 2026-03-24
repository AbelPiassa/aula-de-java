 class Universidade {
    String faculdade;
    String cidade;


    void faculdade(){
    System.out.println("Sua universidade é: " + faculdade);
    System.out.println("Seu nome: " + cidade);
}

    class professor {
    String nome;
    String disciplina;
    

    void prof(){
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua disciplina é: " + disciplina);

    }

    public class Main {
    
        
    
    public  void main(String[] args) {
        Universidade facul = new Universidade();
        professor profe = new professor();

        facul.faculdade = "positivo";
        facul.cidade = "Londrina";
        
        profe.nome = "Maria";
        profe.disciplina = "ADS";


        facul.faculdade();
        profe.prof();
    }
    
 }
}

 }