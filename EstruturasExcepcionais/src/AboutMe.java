import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        try {
            //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos
        System.out.println("Ola, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "e " + altura + " de altura");
        }
        catch(InputMismatchException e) {
            System.out.println("O campo idade e altura precisam ser numéricos ou com .");
        }
    }
}
