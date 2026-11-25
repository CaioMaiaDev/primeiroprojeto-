
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int numero2 = leitor.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior!");
        } else {
            System.out.println("O segundo número é maior");
        }


    }
}
