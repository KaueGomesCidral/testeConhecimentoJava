import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua nota: ");
        int nota = scanner.nextInt();

        if(nota >= 90){
            System.out.println("Classificação: Excelente");
        }else if(nota < 90 && nota >= 70){
            System.out.println("Classificação: Bom");
        }else if(nota < 70 && nota >= 50){
            System.out.println("Classificação: Regular");
        }else{
            System.out.println("Classificação: Insuficiente");
        }

        scanner.close();
    }
}
