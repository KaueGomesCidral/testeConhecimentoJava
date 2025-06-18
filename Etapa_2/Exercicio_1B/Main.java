public class Main {
    public static void main(String[] args) {
       Produto produto = new Produto();

       produto.nome = "Gatorade";
       produto.preco = 12.20;
       produto.quantidade = 10;
        
       produto.exibirInformacoes();
    }
}
