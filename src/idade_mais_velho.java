import java.util.Scanner;

public class idade_mais_velho {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeMaisVelho ="";
        int idadeMaisVelho = -1;

        for(int i = 1; i<=3; i++){
            System.out.print("Digite o nome da " + i + " pessoa");
            String nomePessoa = leitor.nextLine();

            System.out.print("Digite a idade de " + nomePessoa + ": ");
            int idadePessoa = leitor.nextInt();
            leitor.nextLine();

            if (idadePessoa>idadeMaisVelho){
                idadeMaisVelho = idadePessoa;
                nomeMaisVelho = nomePessoa;
            }
        }
        System.out.println("\nA pessoa mais velha é: " + nomeMaisVelho + " (" + idadeMaisVelho + " anos)");
    }

}