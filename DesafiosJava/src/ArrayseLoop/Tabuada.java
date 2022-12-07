package ArrayseLoop;

import java.util.Scanner;

/*Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50 */

public class Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // usuário inserir no teclado
        System.out.println("Tabuada:    ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for (int i = 1; i <= 10; i = i + 1) { // vai fazer contar 1 a 10, os numeros aparecem em pé
            System.out.println(tabuada + "X" + i + "=" + (tabuada * i)); // numero escrito (tabuada) x i (que são todos
                                                                         // os numeros de 1 a 10) = o resultado da
                                                                         // multiplicação disso

        }
    }

}
