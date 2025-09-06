import java.util.Scanner;

public class Calcular_pares {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        System.out.println("Digite 10 numeros inteiros: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print("numero " + i + ":");
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }else {
                impares++;
            }
        }

        System.out.println("\nQuantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);

        leitor.close();
    }
}
