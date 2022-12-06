public class Usuario {

    public static void main(String[] args) throws Exception {

        smartTv smartTv = new smartTv();

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual " + smartTv.volume);

        System.out.println("Canal atual " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual " + smartTv.canal);

    }

}
