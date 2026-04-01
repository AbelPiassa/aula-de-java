class Carro {
    String nome;
    String modelo;

    public Carro(){};

    public Carro(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }
}

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro("bmw", "bmw");
        System.out.println(car.nome, car.modelo);
    }

}
