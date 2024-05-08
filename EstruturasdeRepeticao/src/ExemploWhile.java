import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce custou, R$ " + valorDoce + "e foi adicionado ao carrinho!");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("A mesada acabou!" );
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
