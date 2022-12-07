package ArrayseLoop;

import java.util.Scanner;

public class Consoantes {

    /*
     * Faça um Programa que leia um vetor de 6 caracteres,
     * e diga quantas consoantes foram lidas.
     * Imprima as consoantes.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; // o array nasce e morre coma quantidade estipulada usada ou não
        int quantidadeConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeConsoantes++;
                // ele vai comparar a "letra" com o que for posto e vai dizer se eh V se
                // = e F diferente, não importa maiuscula ou não
            }

            count++;

        } while (count < consoantes.length);

        for (String consoante : consoantes) {

            System.out.println(consoante);

        }

    }

}
