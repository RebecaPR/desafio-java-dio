package ArrayseLoop;

import java.util.Scanner;

public class Fatorial {

    /*
     * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
     * usuário.
     * Ex.: 5!=5.4.3.2.1=120
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("fatorial   ");
        int fatorial = scan.nextInt();

        int multiplicação = 1; // tem que ser igual a 1 pq se não tudo x 0 é 0

        System.out.println(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i = i - 1) {

            multiplicação = multiplicação * i;
        }

        System.out.println(multiplicação);

    }

}
