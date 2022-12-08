package Desafios;

import java.util.Scanner;

public class Desafio4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt(); // valor cheio
        int S = input.nextInt(); // porcentagem

        double x = (S * 100) / M;

        System.out.println("O desconto foi de :  " + (100 - x) + "%");

    }

}
