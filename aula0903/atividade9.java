import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        int senha = 1234;

        Scanner entrada = new Scanner(System.in);

        while (senha != 1234) {
            System.out.println("Digite sua senha");
            senha = entrada.nextInt();
            System.out.println("incorreto");
         }

         System.out.println("acessado");
         entrada.close();
    }
}
