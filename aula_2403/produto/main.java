package produto;
import java.util.ArrayList;

class produto {

    String nome;
    Double preco;

    void mostrarProduto() {

        System.out.println("Seu produto adquerido é: " + nome);
        System.out.println("Preço pago" + preco);

    }
}


    public class main {
        public static void main(String[] args) {           

            ArrayList<produto> produtos = new ArrayList<>();

            produto p1 = new produto();
            p1.nome = "celular";
            p1.preco = 2.000;

            produto p2 = new produto();
            p2.nome = "notebook";
            p2.preco = 4.000;

            produto p3 = new produto();
            p3.nome = "mouse";
            p3.preco = 30.00;

            produtos.add(p1);
            produtos.add(p2);
            produtos.add(p3);

            for (produto p: produtos) {
                System.out.println(p.nome);
            }

        }

    }
