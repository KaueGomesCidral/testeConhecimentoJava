import java.util.Scanner;

public class Exercicio_14 {
    public static void mensagem(String nome, int idade){
        System.out.println(String.format("Olá, %s! Você tem %s anos", nome, idade));
    }
    public static void main(String[] args) {
        Scanner verCoisas = new Scanner(System.in);
        System.out.print("Qual seu nome: ");
        String nome = verCoisas.nextLine();
        System.out.print("Qual sua idade: ");
        int idade = verCoisas.nextInt();

        mensagem(nome, idade);
    }
}
