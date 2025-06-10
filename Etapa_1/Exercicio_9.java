import java.util.Scanner;
public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner verNum = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("Digite um número (0 para sair): ");
            num = verNum.nextInt();
        }while (num != 0);
        
        System.out.println("Você saiu do programa.");

        verNum.close();
    }
}
