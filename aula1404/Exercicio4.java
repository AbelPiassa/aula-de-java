import java.util.Scanner;

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;

        if (saldo < 0) {
            System.out.println("Saldo invalido");
        } else {
            System.out.println("Saldo positivo");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
    public class Exercicio4{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite seu saldo: ");
            double saldo = input.nextDouble();

            ContaBancaria s = new ContaBancaria(saldo);
            System.out.println("seu Saldo: " + s.getSaldo());

            input.close();
        }


    }