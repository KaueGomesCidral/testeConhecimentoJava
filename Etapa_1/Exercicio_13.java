import java.util.Scanner;

public class Exercicio_13 {
    public static double calcularMedia(double numA, double numB, double numC){
        return ((numA + numB + numC) / 3);
    }
    public static void main(String[] args) {
        Scanner olhar = new Scanner(System.in);
        System.out.println("Me de suas notas");
        System.out.print("nota 1: ");
        double numA = olhar.nextDouble();
        System.out.print("nota 2: ");
        double numB = olhar.nextDouble();
        System.out.print("nota 3: ");
        double numC = olhar.nextDouble();

        double media =calcularMedia(numA, numB, numC);

        if (media < 7) {
            System.out.println("Reprovado");
            System.out.println("Sua media é " + media);
        }else{
            System.out.println("Aprovado");
            System.out.println("Sua media é " + media);
        }
    }
}
