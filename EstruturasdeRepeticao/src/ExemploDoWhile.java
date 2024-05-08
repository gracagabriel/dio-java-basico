import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //executando diversas vezes até ser atendido
            System.out.println("Telefone tocando..");

        }while(tocando());

        System.out.println("Alô! Quem é?");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        
        System.out.println("Atendeu? " + atendeu);

        //parar de tocar
        return ! atendeu;
    }
}
