import java.util.ArrayList;

class Produto {
    String nome;
    Double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

class ProdutoFisico extends Produto {
    double peso;

    public ProdutoFisico(String nome, double preco, double peso) { // isso é um construtor
        super(nome, preco);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    double tamanhoArquivo;

    public ProdutoDigital(String nome, double preso, double tamanhoArquivo) {
        super(nome, preso);
        this.tamanhoArquivo = tamanhoArquivo;
    }
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

        ProdutoFisico p3 = new ProdutoFisico("notebook", 25.0, 2.500); // protudo fisico
        ProdutoDigital p4 = new ProdutoDigital("PDF Java", 43.9, 50.0); // produto digital

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(p3);
        carrinho.adicionarProduto(p4);

        carrinho.listarProdutos();
        carrinho.calcularTotal();

    }

}