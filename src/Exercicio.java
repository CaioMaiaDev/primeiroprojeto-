public class Exercicio {
    public static void main(String[] args) {
        double precoOriginal = 615;

        double percentualDesconto = 10.0;
        double valorIrreal = precoOriginal * percentualDesconto;
        double valorDesconto = valorIrreal / 100;

        double valorFinal = precoOriginal - valorDesconto;

        System.out.println("O valor final com desconto fica: " + valorFinal);
    }
}
