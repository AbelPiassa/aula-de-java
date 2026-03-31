import java.util.ArrayList;
import java.util.List;

// --- Estrutura ---

// Classe Produto: Funciona como o "molde" ou ficha de cadastro do item.
class Produto {
    // Variáveis: abertas (sem 'private') para permitir acesso direto pelas outras
    // classes.
    String nome;
    double preco;

    // Construtor: Chamado automaticamente ao criar um novo Produto (usando 'new').
    // Nomes de parâmetros diferentes (n e p) evitam o uso da palavra 'this'.
    public Produto(String n, double p) {
        // Recebe os valores de fora (n e p) e os repassa para as variáveis do objeto.
        nome = n;
        preco = p;
    }
}

// Classe Carrinho: Funciona como o "gerente" ou recipiente dos produtos.
class Carrinho {
    // Uma Lista dinâmica para guardar vários objetos 'Produto' de uma vez.
    List<Produto> listaDeProdutos;

    // Construtor do Carrinho
    public Carrinho() {
        // Inicializa a lista vazia (como pegar um cesto vazio no supermercado).
        listaDeProdutos = new ArrayList<>();
    }

    // --- Métodos (As Ações) ---

    public void adicionarProduto(Produto produto) {
        // Usa o comando .add() nativo da Lista para guardar o produto recebido lá
        // dentro.
        listaDeProdutos.add(produto);
        // Acessa a variável 'nome' do produto diretamente e imprime uma mensagem de
        // sucesso.
        System.out.println("'" + produto.nome + "' adicionado ao carrinho.");
    }

    public void listarProdutos() {
        System.out.println("\n--- Produtos no Carrinho ---");

        // Laço for-each: "Para cada 'produto' dentro da 'listaDeProdutos', repita o
        // código abaixo:"
        for (Produto produto : listaDeProdutos) {
            // Acessa 'nome' e 'preco' diretamente e os imprime formatados na tela.
            System.out.printf("- %s: R$ %.2f\n", produto.nome, produto.preco);
        }
        System.out.println("----------------------------");
    }

    public double calcularTotal() {
        // Cria uma variável acumuladora começando do zero.
        double total = 0.0;

        // Percorre cada produto da lista novamente.
        for (Produto produto : listaDeProdutos) {
            // A cada volta, pega o valor atual do 'total' e soma com o 'preco' do produto
            // atual.
            total += produto.preco;
        }

        // Quando a lista acaba, devolve (return) o resultado final da soma completa.
        return total;
    }
}

// === Simulando o Sistema ===
public class Main {
    public static void main(String[] args) {

        // 1. Cadastro de produtos
        // Fabricando 3 objetos Produto diferentes na memória, definindo nome e preço
        // para cada um.
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Mouse sem fio", 120.50);
        Produto produto3 = new Produto("Teclado Mecânico", 350.00);

        // 2. Criação de pedido
        // Criando um cesto vazio instanciando a classe Carrinho.
        Carrinho meuCarrinho = new Carrinho();

        // Passando os nossos 3 produtos para a função adicionarProduto colocar dentro
        // da lista.
        meuCarrinho.adicionarProduto(produto1);
        meuCarrinho.adicionarProduto(produto2);
        meuCarrinho.adicionarProduto(produto3);

        // Mandamos o carrinho mostrar o que tem dentro dele no momento.
        meuCarrinho.listarProdutos();

        // 3. Cálculo do total
        // Pedimos para o carrinho executar a matemática da soma e guardamos o resultado
        // na variável 'totalPedido'.
        double totalPedido = meuCarrinho.calcularTotal();

        // Imprimimos o resultado final na tela.
        System.out.printf("Total do Pedido: R$ %.2f\n", totalPedido);
    }
}