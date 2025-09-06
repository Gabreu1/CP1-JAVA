import java.util.Scanner;

public class Tabuada {
    public static void contaTabuada(int numero){
        System.out.println("Tabuada do " + numero + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println( numero + "x" + i + "=" + (numero*i));
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = leitor.nextInt();
        contaTabuada(numero);

    }
}
