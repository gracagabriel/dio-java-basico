import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*TO DO:
         * IMPORTAR A CLASSE SCANNER
         * EXIBIR MENSAGENS PARA O USUÁRIO
         * OBTER PELO SCANNER OS DADOS INFORMADOS PELO USUÁRIO
         * EXEBIR MENSAGEM FINAL (CONTA CRIADA)
         */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Agora o número da conta.");
        int numeroConta = scanner.nextInt();

        System.out.println("Sua agência.");
        String agencia = scanner.next();

        System.out.println("Insira o valor de depósito inicial da sua nova conta!");
        double saldo = scanner.nextDouble();

        //IMPRIMINDO RESULTADO

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + ". Seu saldo atual é de R$ " + saldo);

    }
}
