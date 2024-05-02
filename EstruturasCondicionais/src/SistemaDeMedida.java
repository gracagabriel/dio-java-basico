public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "G";

        /*
         * if(sigla == "P")
         * System.out.print("PEQUENO");
         * else if(sigla == "M")
         * System.out.print("MEDIO");
         * else if(sigla == "G")
         * System.out.print("GRANDE");
         * else
         * System.out.print("INDEFINIDO");
         */

        // UTILIZANDO SWITCH CASE

        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
}
