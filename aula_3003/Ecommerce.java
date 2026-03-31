import java.util.ArrayList;

class Produto {
    String nome;
    Double preco;

}

class Carrinho {
    String nome;
    Double preco;

    ArrayList<Produto> produtos = new ArrayList<>();

    void adicionarProduto(Produto produto) {
        produtos.add(produto);

    }

    void listarProdutos() {
        System.out.println("Produtos no carrinho");

        for (Produto p : produtos) {
            System.out.println(p.nome + " - R$  " + p.preco);
        }
    }

    void calcularTotal() {
        double  total = 0.0;
        for (Produto p : produtos) {
            total += p.preco;
        }
        System.out.println("Total da compra: " + total);
        }   
    }

        public class Ecommerce {

            public static void main(String[] args) {

                Produto p1 = new Produto();
                p1.nome = "Notebook";
                p1.preco = 300.0;

                Produto p2 = new Produto();
                p2.nome = "mouse";
                p2.preco = 15.0;

                Carrinho carrinho = new Carrinho();

                carrinho.adicionarProduto(p1);
                carrinho.adicionarProduto(p2);

                carrinho.listarProdutos();
                carrinho.calcularTotal();

            }

        }


