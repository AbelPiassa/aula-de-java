class carro {
    String marca;
    String modelo;
    double velocidade;

    void acelerar(){

        System.out.println("O carro esta acelerando");
    }
    
}

public  void main(String [] args){
    carro carro1 = new carro();

    carro1.marca = "VW";
    carro1.modelo = "Gol";
    carro1.velocidade = 120;


    carro1.acelerar();
}