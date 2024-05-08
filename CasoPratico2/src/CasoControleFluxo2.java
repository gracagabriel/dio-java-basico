import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CasoControleFluxo2 {
    public static void main(String[] args) {

        String[] candidatos = { "JUVENAL", "ARNALDO", "CESAR", "RONALDO", "ADRIANO" };

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.print("CONTATO REALIZADO COM SUCESSO! ");
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM O " + candidato + " NA " + tentativasRealizadas + " TENTATIVA ");
        else
            System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + " , NUMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
    }

    // metado auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "JUVENAL", "ARNALDO", "CESAR", "RONALDO", "ADRIANO" };

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero: " + (indice + 1) + " é o " + candidatos[indice]);
        }

        /*
         * for(String candidato: candidatos) {
         * System.out.println("O candidato selecionado foi" + candidato)}
         */
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "JUVENAL", "ARNALDO", "CESAR", "RONALDO", "ADRIANO", "ROBSON", "MATHEUS", "LUCAS",
                "JUVENAL" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor para a vaga: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void AnalisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato e oferecer contra proposta.");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
