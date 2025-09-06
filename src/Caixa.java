import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a altura da caixa em metros: ");
        double altura = leitor.nextDouble();

        System.out.print("Digite o comprimento da caixa em metros: ");
        double comprimento = leitor.nextDouble();

        System.out.print("Digite a largura da caixa em metros: ");
        double largura = leitor.nextDouble();

        double volume = altura * comprimento * largura;

        System.out.printf("O volume da caixa é: %.2f metros cúbicos\n", volume);
    }

}
