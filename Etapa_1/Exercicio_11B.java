import java.util.Scanner;
public class Exercicio_11B {
    public static void main(String[] args) {
        Scanner lerString = new Scanner(System.in);
        String[] cidades = new String[5];

        for(int i = 0; i < cidades.length; i++){
            System.out.println("Digite um nome de uma cidade: ");
            cidades[i] = lerString.nextLine();
        }
        System.out.print("Digite mais um nome de uma cidade: ");
        String novacidade = lerString.nextLine();

        boolean verificador = false;
        for(int i = 0;i < cidades.length; i++){
            if(cidades[i].equalsIgnoreCase(novacidade)){
                verificador = true;
                break;
            }
        }
        if(verificador){
            System.out.println(String.format("A cidade %s já foi cadastrada!", novacidade));

        }else{
            System.out.println(String.format("A cidade %s não foi cadastrada!", novacidade));

        }
    }
}
