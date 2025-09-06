import java.util.Scanner;

public class Contagem {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Digite um numero inteiro para a contagem: ");
    int numero = leitor.nextInt();

    System.out.print("Contagem regressiva: ");
    for(int i = numero; i >= 0; i--){
        System.out.print(i + ". ");
        }
    }

}
