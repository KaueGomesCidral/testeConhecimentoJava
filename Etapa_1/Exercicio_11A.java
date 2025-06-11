import java.util.Scanner;
public class Exercicio_11A {
    public static void main(String[] args) {
        Scanner lerString = new Scanner(System.in);
        String[] cidades = new String[5];

        for(int i = 0; i < cidades.length; i++){
            System.out.println("Digite um nome de uma cidade: ");
            cidades[i] = lerString.nextLine();
        }
        for(int i = 0; i < cidades.length; i++){
            System.out.println("Cidade " + (i + 1) +" : " + cidades[i] );
        }
    }
}
