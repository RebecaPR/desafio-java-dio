package ArrayseLoop;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int conta = 0;

        do {
            System.out.println("Número :   ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            conta = conta + 1;

        } while (conta < 5);

        System.out.println("Maior:  " + maior);
        System.out.println("Média:   " + (soma / 5));

    }

}
