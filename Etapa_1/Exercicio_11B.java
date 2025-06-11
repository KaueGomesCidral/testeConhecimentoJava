import java.util.Scanner;
public class Exercicio_11B {
    public static void main(String[] args) {
        Scanner lerString = new Scanner(System.in);
        String[] cidades = new String[5];

        for(int i = 0; i < cidades.length; i++){
            System.out.println("Digite um nome de uma cidade: ");
            cidades[i] = lerString.nextLine();
            for(int j = 0; j < cidades.length; j++){
                if(cidades[i] == cidades[j]){
                    System.out.println("A cidade " + cidades[i] + " já foi cadastrada!");
                }else
                    System.out.println("A cidade " + cidades[i] + " não está na lista.");
            }
        }
        for(int i = 0; i < cidades.length; i++){
            System.out.println("Cidade " + (i + 1) +" : " + cidades[i] );
        }
    }
}
