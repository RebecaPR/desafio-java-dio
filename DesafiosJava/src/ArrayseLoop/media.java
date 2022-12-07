package ArrayseLoop;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        // quase o mesmo sistema da conta
        int conta = 0;

        do {
            System.out.println("Número :   ");
            numero = scan.nextInt();

            soma = soma + numero;
            // a variavel soma é igua a zero, então 0+ numero informado vai ser igual ao
            // numero, e ai o resultado vai assumir a variavel numero, quanso eu
            // informar outro numero ele vai ser somado ao resultado anterior (0+numero) e
            // assim por diante

            if (numero > maior)
                maior = numero;
            // se o numero que eu falei for mair que a variavel maior, então a variavel
            // maior tenha o mesmo valor que a variavel numero

            conta = conta + 1;
            // o contador começa em zero e vai se somando 1 a ele e ai ele vai até chegar ao
            // 5

        } while (conta < 5);

        System.out.println("Maior:  " + maior);
        System.out.println("Média:   " + (soma / 5));

        // já que são 5 numeros basta colocar o 5 fixo

        // as impressoes estão fora do laço entao só vai imprimir quando terminar o laço

    }

}
