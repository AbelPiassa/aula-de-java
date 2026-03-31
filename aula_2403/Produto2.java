import java.util.ArrayList;

class Produto2 {
    String nome;
    Double preco;
}

class Pedido {
    String nome;
    Double precoTotal;

    ArrayList<Produto2> produtos = new ArrayList<>();

    void listarProduto() {

        for (Produto2 p : produtos) {
            System.out.println(p.nome + "-" + p.preco);
        }
    }
}

class Main {
    public static void main(String[] args) {
        
    
    Produto2 p1 = new Produto2();
    p1.nome = "celular";
    p1.preco = 2000.0;
    
    Pedido pedido = new Pedido();
    pedido.produtos.add(p1);

    pedido.listarProduto();
}
}