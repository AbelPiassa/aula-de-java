class Aluno { // Declaração da classe aluno (modelo/objeto)
    String nome; 
    int idade;
    String curso;
    String cpf;

    void apresentar(){ // // Método que exibe informações do aluno
        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("O numero do cpf é: " + cpf);                                                    
    }

    void estudar(){ // Método que representa uma ação do aluno
        System.out.println("Vai estudar");
}

    public static void main(String [] args){
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Abel";
        aluno1.idade = 30;
        aluno1.curso = "ADS";
        aluno1.cpf = "12345678910";

        aluno1.apresentar(); // Chama o método apresentar (exibe os dados
        aluno1.estudar();   //  Chama o método estudar
    }

}




    
