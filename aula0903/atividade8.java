import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int soma = 0;
        while (numero != 0) {
            System.out.println("Digite um número (0 para sair)");
            numero = entrada.nextInt();
            soma = soma + numero;
        }

        System.out.println("Soma total" + soma);
        entrada.close();
    }
    
}
