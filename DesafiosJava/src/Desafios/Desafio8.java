package Desafios;

import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        final int fatia = 4;
        Scanner scanner = new Scanner(System.in);

        int NAmigos = scanner.nextInt();

        for (int i = 1; i <= NAmigos; i++) {

            double amigos = scanner.nextInt() * NAmigos;

            double npizzas = Math.ceil(amigos / fatia);

            System.out.println((int) npizzas);

        }

        scanner.close();

    }
}
