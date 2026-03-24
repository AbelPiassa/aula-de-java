public class produto {

    String nome;
    double preco;
    int quantidade;

    void loja(){
        System.out.println("Produto: " + nome);
        System.out.println("Esta: " + preco);
        System.out.println("Quantidade: " + quantidade);

    }

    
    
    public void main(String []args){
        produto produto1 = new produto();

        produto1.nome = "Notebook";
        produto1.preco = 3.000;
        produto1.quantidade = 3;


        produto1.loja();
        

    }
}
