class pessoa {
    String estado;
    String cidade;
    
    void caracteristica(){
        System.out.println("Qual estado você mora: " + estado);
        System.out.println("E a cidade: " + cidade);
    }

    public void main(String[] args) {
        pessoa pessoa1 = new pessoa();

        pessoa1.estado = "Parana" ;
        pessoa1.cidade = "Londrina";

        
    pessoa1.caracteristica();
    }

    
}
