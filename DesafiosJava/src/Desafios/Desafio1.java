package Desafios;

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade:   ");
        int idade1 = leitor.nextInt();

        System.out.println("Digite a sua idade:   ");
        int idade2 = leitor.nextInt();

        System.out.println("Digite a sua idade:   ");
        int idade3 = leitor.nextInt();

        int media = (idade1 + idade2 + idade3) / 3;
        System.out.println(" A média das idades é   " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem!");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é adulta!");
        } else {
            System.out.println("A turma é idosa!");
        }

    }

}
