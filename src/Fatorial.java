import java.util.Scanner;

public class Fatorial {

    public static int fatorial(int numero) {
       if (numero <= 0){
           System.out.println("Digite um numero inteiro positivo: ");
       }

       int fatorial = 1;

       for (int i = 1; i <= numero; i++) {
           fatorial *= i;
       }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = leitor.nextInt();
        int resultado = fatorial(num);
        System.out.println("Fatorial de " + num + " = " + resultado);
    }
}
