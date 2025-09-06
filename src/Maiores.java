import java.util.Scanner;


public class Maiores {
    public static int numeroMaior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int resultado = numeroMaior(num1, num2);
        System.out.println("o maior numero é: " + resultado);
    }
}
