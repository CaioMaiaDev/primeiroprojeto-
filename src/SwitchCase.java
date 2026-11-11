public class SwitchCase {
    public static void main(String[] args) {
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu: Ver Saldo");
                break;
            case 2:
                System.out.println("Você escolheu: Ver Extrato");
                break;
            case 3:
                System.out.println("Você escolheu: Falar com Atendente");
                break;
            default:
                System.out.println("Opção inválida! Digite 1, 2 ou 3.");
                break;
        }
    }
}
