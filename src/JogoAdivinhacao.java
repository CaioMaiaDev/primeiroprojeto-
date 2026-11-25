import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(101);
        int tentativas = 0;
        int palpite = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            palpite = leitor.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número em " + tentativas);
                break;
            } else if (palpite < numeroAleatorio){
                System.out.println("O seu palpite é menor que o número sorteado");
            } else {
                System.out.println("O seu palpite é maior que o número sorteado");
            }
        }

        if (tentativas == 5 && palpite != numeroAleatorio) {
            System.out.println("Sinto muito! Você não conseguiu acertar o número em 5 tentativas. O número era: " + numeroAleatorio);
        }
    }
}
