import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2450;
        int opcao = 0;

        // Adicione este bloco antes do while:
        System.out.println("*******************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println(); // Pula uma linha em branco no console
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("*******************************************");


        while (opcao != 4) {
            System.out.println("Operações");

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção desejada");
            opcao = leitor.nextInt();
            if (opcao == 1) {
                System.out.println("O saldo atual é de: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a receber:");
                double valorReceber = leitor.nextDouble();
                saldo = saldo + valorReceber;
                System.out.println("O seu novo saldo é: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Quanto você deseja enviar?");
                double valorEnviar = leitor.nextDouble();

                if (valorEnviar > saldo) {
                    System.out.println("Não a saldo suficiente para a transferencia");
                } else {
                    saldo = saldo - valorEnviar;
                    System.out.println("Seu novo saldo é: " + saldo);
                }

            } else if (opcao == 4) {
                System.out.println("Muito obrigado pelo contato!");
            }
        }
    }
}