import java.util.Scanner;


public class Numeros_Inteiros {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite um segundo numero: ");
        int numero2 = leitor.nextInt();

        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);


        if (maiorNumero - menorNumero <= 1){
            System.out.println("Nâo ha numeros inteiros entre" + numero1 + " e " + numero2 +".");
        }else{
            System.out.println("Numeros inteiros entre " + numero1 + " e " + numero2 +".");
            for(int i = menorNumero + 1; i <= maiorNumero; i++){
                System.out.print(i + ".");
            }
        }
    }
}
