import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro. ");
        int parametroUm = scan.nextInt();

        System.out.println("Digite o segundo parametro. ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois < parametroUm)
            throw new ParametrosInvalidosException();
        else
            System.out.println("Parâmetros estao corretos!");

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i < contagem; i ++)
            System.out.println("DO PARAMETRO UM " + parametroUm + " PARA O PARAMETRO DOIS " + parametroDois + " TEMOS " + (i+1) + " DE DIFERENÇA");
        
    }
}