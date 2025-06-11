import java.util.Scanner;

public class Exercicio_12 {
    public static void mensagemdeBoasVindas(){
        System.out.println("Bem-vindo ao programa!");
    }

    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        mensagemdeBoasVindas();
        Scanner num = new Scanner(System.in);
        System.out.println("Me dê dois numeros para multiplicar");
        System.out.print("Número 1: ");
        int num1 = num.nextInt();
        System.out.print("Número 2: ");
        int num2 = num.nextInt();
        System.out.println("Resultado da multiplicação: " + multiplicar(num1, num2));
    }
}
