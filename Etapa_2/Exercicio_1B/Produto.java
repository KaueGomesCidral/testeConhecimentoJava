import java.util.Scanner;
public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public void exibirInformacoes(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + quantidade +" unidades");
    }

    public void adicionarEstoque(){
        System.out.println("Quantas unidades você quer adicionar?");
        Scanner lerNum = new Scanner(System.in);
        int adicionar = lerNum.nextInt();
        this.quantidade += adicionar;
        System.out.println("adicionando " + adicionar + " ao estoque...");
    }

    public void removerEstoque(){
        System.out.println("Quantas unidades você quer remover?");
        Scanner lerNum = new Scanner(System.in);
        int remover = lerNum.nextInt();
        if(remover > quantidade){
            System.out.println("Esta removendo mais que tem irmão, vai ficar com 0");
            System.out.println("Removendo " + remover + " unidades do estoque...");
            this.quantidade = 0;
        }else{
            System.out.println("Removendo " + remover + " unidades do estoque...");
            this.quantidade -= remover;
        }
    }
}
