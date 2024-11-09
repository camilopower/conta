import java.util.Scanner;

public class conta {

    public static void main(String[] args) {
        
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opção = 0;

        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n******************");

        String menu = """
            *** Digite sua opção ***
            
            1 - Consultar saldo
            2 - Transferir valor
            3 - Receber valor
            4 - Sair
        """;
        
        Scanner leitura = new Scanner(System.in);

        // Loop até o usuário escolher a opção 4 (sair)
        while (opção != 4) {
            System.out.println(menu);

            // Lê a opção do usuário
            opção = leitura.nextInt();
            
            // Verifica a opção escolhida
            if (opção == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opção == 2) {
                System.out.println("Qual valor você deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Transferência realizada. Novo saldo: " + saldo);
                }
            } else if (opção == 3) {
                System.out.println("Informe o valor a ser recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Valor recebido. Novo saldo: " + saldo);
            } else if (opção != 4) {
                System.out.println("Opção inválida, por favor escolha uma opção válida.");
            }
        }

        System.out.println("Saindo do sistema... até logo!");
    }
}
