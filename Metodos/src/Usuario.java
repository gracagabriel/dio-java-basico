public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);

        System.out.println("Volume atual : " + smartTv.volume);


        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Click! - Tv ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Click! - Tv desligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Click! - Volume atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Click! - Volume atual : " + smartTv.volume);
    }
}
