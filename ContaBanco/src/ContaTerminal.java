import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criar um objeto Scanner para ler os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Declarar as variáveis para armazenar os atributos da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitar e ler os dados do usuário
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();

        //Consumir a quebra de linha após o número da conta
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da Conta !");
        saldo = scanner.nextDouble();

        // Fechar o objeto Scanner
        scanner.close();

        // Exibir a mensagem de boas-vindas com os dados da conta
        System.out.println("Olá " + nomeCliente + 
                           ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                           ", conta " + numero + 
                           " e seu saldo " + saldo + 
                           " já está disponível para saque.");
    }
}
