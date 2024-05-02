public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        if(plano == "B"){
            System.out.println("PLANO BASIC ESCOLHIDO.");
            System.out.println("100M DE LIGAÇÒES.");
        }else if(plano == "M"){
            System.out.println("PLANO MIDIA ESCOLHIDO.");
            System.out.println("100M DE LIGAÇÒES + INSTAGRAM E FACEBOOK GRÁTIS.");
        }else if(plano == "T"){
            System.out.println("PLANO TURBO ESCOLHIDO.");
            System.out.println("100M DE LIGAÇÒES + INSTAGRAM E FACEBOOK GRÁTIS.");
            System.out.println("+ 5GB YOUTUBE");
        }else
            System.out.println("PLANO NÃO ENCONTRADO.");

    }
}
