import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Bem vindo(a) ao Banco Dio!");

            System.out.println("Vamos criar uma conta em nosso banco. Por favor, digite o número da Agência:");
            int agencia = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Digite o número da sua conta:");
            int numero = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Digite seu nome completo:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Digite seu saldo inicial:");
            double saldo = scanner.nextDouble();

            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d, e seu saldo R$ %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, certifique-se de digitar os valores corretamente.");
        } finally {
            scanner.close();
        }
    }
}
