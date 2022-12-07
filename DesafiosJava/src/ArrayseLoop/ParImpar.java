package ArrayseLoop;

import java.util.Scanner;

public class ParImpar {
    /*
     * Faça um programa que peça N números inteiros.
     * Calcule e mostre a quantidade de números pares e
     * a quantidade de números impares.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantnumeros;
        int numero;
        int pares = 0;
        int impares = 0;

        System.out.println("Quantidade de números:   ");
        quantnumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Escreva o número:   ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                pares++; // se o resto da divisão por 2 = 0 o numero é par, se for V soma uma unidade a
                         // variavel
                         // par porque ele começa do zero, ou seja (vai 1 item para o "saquinho de nome
                         // pares")
            else
                impares++; // se não vai 1 item para o "saquinho de nome impares"

            count = count + 1; // Aqui tb ocorre a mesma coisa, por ter rodado 1x o laço, soma-se 1 item ao
                               // saquinho de nome count

        } while (count < quantnumeros); // enquanto o contador for menor que a quantidade de numeros eu quero que o
                                        // laço continue se for igual ele vai parar

        System.out.println(" Quantidade pares:    " + pares);
        System.out.println(" Quantidade ímpares:    " + impares);

    }

}
