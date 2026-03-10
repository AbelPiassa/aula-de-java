import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            System.out.println("Digite um número (0 para sair)");
            numero = entrada.nextInt();
        }

        System.out.println("Programa finalizado!");
        entrada.close();
    }
    
}
