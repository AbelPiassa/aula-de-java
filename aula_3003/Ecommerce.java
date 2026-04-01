import java.util.ArrayList;

class Produto {
    String nome;
    Double preco;
}

class ProdutoFisico extends Produto {
    double peso;
}

class ProdutoDigital extends Produto {
    double tamanhoArquivo;
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

            // verificando tipo do produto
            if (p instanceof ProdutoFisico) {
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("Peso : " + pf.peso + "kg");
            }
            if (p instanceof ProdutoDigital) {
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("tamanho: " + pd.tamanhoArquivo + " MB");
            }
        }
    }

    void calcularTotal() {
        double total = 0;
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

        ProdutoFisico p3 = new ProdutoFisico(); // protudo fisico
        p3.nome = "notebook";
        p3.peso = 25.0;
        p3.preco = 2.500;

        ProdutoDigital p4 = new ProdutoDigital(); // produto digital
        p4.nome = "PDF Java";
        p4.tamanhoArquivo = 43.9;
        p4.preco = 50.0;

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);
        carrinho.adicionarProduto(p4);

        carrinho.listarProdutos();
        carrinho.calcularTotal();

    }

}
