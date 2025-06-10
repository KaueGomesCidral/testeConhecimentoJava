
import java.util.Scanner;


public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner verNum  = new Scanner(System.in);
        System.out.print("Digite a opção desejada: ");
        int opcao = verNum.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu cadastrar um usuário.");
                break;
            case 2:
                System.out.println("Você escolheu deletar um usuário.");
                break;
            case 3:
                System.out.println("Você escolheu sair.");
                break;
            default:
                System.out.println("Opção inválida");
        }
        verNum.close();
    }
}
