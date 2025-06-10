import java.util.Scanner;
public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner verNum = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int maior = Integer.MIN_VALUE; // o menor inteiro possível
        int achavetor = Integer.MIN_VALUE;

        System.out.println("Digite 5 números:");
        for(int i=0; i < 5; i++){
            int num = verNum.nextInt();
            numeros[i] = num;
            soma += numeros[i];
            if(numeros[i] > maior){
                maior = numeros[i];
                achavetor = i;
            }
        }

        System.out.print("Números digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Maior número: " + maior);
        System.out.println("Posição Vetor: " + achavetor);
        
    }
}
