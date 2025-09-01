import java.util.Scanner;

public class leitor_numeros{
    public static void main(String[] args){
        System.out.println("Digite o numero que deseja converter em centrimetros e milimetros");
        Scanner leitor = new Scanner(System.in);
        int numero_escolhido = leitor.nextInt();

        int resultado = numero_escolhido * 100;
        System.out.println("O numero convertido é " + resultado + "cm");

        int resultado_mm = numero_escolhido * 1000;
        System.out.println("O numero convertido em mm é " + resultado_mm + "mm");


    }
}
