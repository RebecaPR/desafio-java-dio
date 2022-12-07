package ArrayseLoop;

/*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa. */

public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = { 9, 7, 10, 2, 5 }; // unidimendional, começam na posição 0

        int count = 0;

        while (count < (vetor.length)) { // retorna o tamanho do vetor (lenght), é -1 pq ele começa do 0, ai vai
                                         // subir 0-(-1) = 1

            System.out.println(vetor[count]);
            count = count + 1;

        }

        System.out.println("\nVetor: ");

        for (int i = (vetor.length - 1); i >= 0; i--) {

            System.out.println(vetor[i]);

        }

    }

}
