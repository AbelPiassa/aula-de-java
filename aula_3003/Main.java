class Animal {
    String nome;   
}

class Carrocho extends Animal {
    String raca;
    
}
class Main{
    public static void main (String[] args){

        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Morgana";
        cachorro.raca = "rottweiler";

    System.out.println("Nome: ", + cachorro.nome );
    System.out.println("sua raça é: ", + cachorro.raca);

}
}