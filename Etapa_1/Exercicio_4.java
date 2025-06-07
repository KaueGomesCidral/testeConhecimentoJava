import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner variavelScanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = variavelScanner.nextInt();

        if(num % 2 == 0){
            System.out.println("O número " + num + " é par" );
        }else
            System.out.println("O número " + num + " é ímpar");
    }
}
