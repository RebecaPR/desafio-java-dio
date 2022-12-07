package ArrayseLoop;

import java.util.Random;

public class Numerosaleatorios {

    public static void main(String[] args) {

        Random random = new Random(); // gera numeros aleatorios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatorios:  ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + "  ");

        }

        System.out.println("Sucessores dos Numeros aleatorios:  ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero + 1) + "  ");

        }

    }

}
