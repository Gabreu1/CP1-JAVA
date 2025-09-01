import java.util.Scanner;

public class main{
    public static void leitor_idade(String[] args){
        System.out.println("informar a sua idade");
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        leitor.nextLine();

        if(idade <= 16){
            System.out.println("você não tem idade minima para votar");
        }else{
            System.out.println("você pode votar!!");
        }
        }
    }






