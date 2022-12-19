package Desafios;

import java.util.Scanner;

public class Desafio6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua jogada:  ");
        int jogadaJogador = leitor.nextInt();
        System.out.println("Digite a sua jogada:   ");
        int jogadaInimigo = leitor.nextInt();

        int resultado = jogadaJogador - jogadaInimigo;

        if (jogadaJogador == jogadaInimigo) {
            System.out.println("Empatou");
        } else if (resultado == 1 | resultado == -2) {
            System.out.println("Ganhou");
        } else {
            System.out.println("Perdeu");
        }
    }
}
