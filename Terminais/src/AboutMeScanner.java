import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Digite o seu nome.");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome.");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade.");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura.");
        double altura = scanner.nextDouble();

        //imprimindo informações coletadas
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos");
        System.out.println("Minha altura é " + altura + "cm");

    }
}
