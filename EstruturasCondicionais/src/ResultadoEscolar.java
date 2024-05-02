public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
         * int nota = 4;

        if(nota >= 7)
            System.out.print("Aprovado");
        
        else if(nota >= 5 && nota < 7)
            System.out.print("Recuperação");

        else
            System.out.print("Reprovado");
         */

         //REDUZINDO PARA OPERADORES TERNÁRIOS

         int nota = 7;
         String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >= 5 ? "Recuperação" : "Reprovado";
         System.out.println(resultado);
    }
}
