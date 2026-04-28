import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        if (cpf == null) {
            System.out.println(("CPF não pode ser vazio"));
        }

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

}

class Carro {
    private String nome;
    private String marca;
    private double preco;

    public Carro(String nome, String marca, double preco) {

        this.nome = nome;
        this.marca = marca;
        setPreco(preco);
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getPreco() {
        return this.preco;

    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("o preço não pode ser ZERO");
        } else {
            System.out.println("Preço esta certo!");
        }

    }

}
class Estoque{
    
        private ArrayList<Carro> carros ;

        public Estoque(){
            carros = new ArrayList<>();
        }

        public void adicionarCarro(Carro carro){
            carros.add(carro);
        }

        public void listarCarro(Carro carro){
            System.out.println("======ESTOQUE======");

            for (Carro c : carros){
                System.out.println(c.getNome() +" " + c.getMarca() + " " + c.getPreco());
            }

        }

        public double calcularTotalEstoque(){
            double total = 0;
            for(Carro c : carros){
                total += c.getPreco();
            }
            return total;
        }
    
}
class Venda{
    private Cliente cliente;
    private Carro carro;

    public Venda (Cliente cliente, Carro carro){
    this.cliente = cliente;
    this.carro = carro;
    }


    public void mostrarResumoVenda(){
        System.out.println("\n====VENDA====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Carro: " + carro.getMarca());
        System.out.println("Preço: " + carro.getPreco());
    }
}

public class Main{
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Abel", "123.456.789.02");

        Carro carro1 = new carro("M3", "BMW")
    }
}