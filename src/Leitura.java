import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual avaliação que você dá para o filme?");
        int avaliacao = leitura.nextInt();

        System.out.println("Seu filme favorito é: " + filme + " " + "que foi lançado no ano: " + anoDeLancamento);
        System.out.println("A sua classificação para o filme:" + " " + avaliacao);
    }
}
