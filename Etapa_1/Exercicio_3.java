import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scaneador = new Scanner(System.in);

        System.out.println("Me de dois números");
        System.out.print("Digite o primeiro número: ");
        int n1 = scaneador.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scaneador.nextInt();
        int resultado = n1 + n2;
        System.out.println("A soma dos números é: " + resultado);

        scaneador.close();
    }
}
