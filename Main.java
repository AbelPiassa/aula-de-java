/*class contaBancaria{
    String titular;
    double saldo;

   public contaBancaria(String titular, double saldo){
   
    this.titular = titular;
    this.saldo = saldo;
   }

}
public class Main{
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria("Abel", 15000);
        System.out.println("Nome: " + conta.titular);
        System.out.println("Saldo: "+ conta.saldo);
    }


}

*/
/* 
class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {

        this.nome = nome;
        this.salario = salario + salario * 0.1;
    }

}

public class Main {
    public static void main(String[] args) {
        Funcionario conta = new Funcionario("Abel", 3000);
        System.out.println("Nome: " + conta.nome);
        System.out.println("Salario: " + conta.salario);
    }

} */





class Usuario {

        String nome;
        String email;
        String senha;
    
        public Usuario (String nome, String email, String senha){
            
            if (senha.length() >= 6 ){
                this.nome = nome;
                this.email = email;
                this.senha = senha;
            }else{
            System.out.println("Senha deve ter no mínimo 6 caracteres");
            }
        }
}

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("abel", "facul@facul.com", "123");

        System.out.println(" Seu nome " + usuario.nome);
        System.out.println("Seu email " + usuario.email);
        System.out.println("sua senha: " + usuario.senha);
    }
}