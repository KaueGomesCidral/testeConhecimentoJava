import java.util.Scanner;

public class Exercicio_15 {
    public static double somar(double num1, double num2){
        return num1 + num2;
    }   

    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }

    public static double divisao(double num1, double num2){
        if(num2 == 0){
            System.out.println("Erro: divisão por zero!");
            return 0; // ou lançar um erro, mas pra agora isso tá ótimo
        }
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner verNum = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        double num1 = verNum.nextDouble();
        double num2 = verNum.nextDouble();

        System.out.println("Qual opção você quer fazer?");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = verNum.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Somar: " + somar(num1, num2));
                break;
            case 2:
                System.out.println("Subtração: " + subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + multiplicacao(num1, num2));
                break;
            case 4:
                System.out.println("Divisão: " + divisao(num1, num2));
                break;
        
            default:
                System.out.println("Digite um número entre 1 e 4");
                break;
        }
        
    } 
}
