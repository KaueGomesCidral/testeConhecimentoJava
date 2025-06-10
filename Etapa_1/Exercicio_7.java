import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner verOp = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 3){
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Deletar");
        System.out.println("3 - Sair");
        System.out.print("Selecione uma das opções: ");
        opcao = verOp.nextInt();

        
            switch (opcao) {
                case 1:
                    System.out.println("Você cadastrou um usuário!");
                    break;
                case 2:
                    System.out.println("Você Deletou um usuário!");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Tente novamente, número invalido!");
            }
        }   
    }
}
