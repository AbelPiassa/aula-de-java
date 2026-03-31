 class Veiculo {
    String marca;
    int modelo;
}

class Carro extends Veiculo{
    int portas;
}

class Moto extends Veiculo{
    int cilindradas;
}

public class Carro{
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();


        carro1.marca = "BMW";
        carro1.modelo = 2026;
        carro1.portas = 4;
        
        moto1.marca = "Yamaha";
        moto1.modelo = 2026;
        moto1.cilindradas = 660;
        

        System.out.println("carro: ", + carro1.marca);
        System.out.println("carro: ", + carro1.modelo);
        System.out.println("carro: ", + carro1.portas);

        System.out.println("moto: ", + moto1.marca);
        System.out.println("moto: ", + moto1.modelo);
        System.out.println("moto: ", + moto1.cilindradas);
     

    }




}
