/*
Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de
cada elemento de A pelo correspondente elemento de B. O resultado deve ser armazenado em um vetor
C.
 */
package lista;

import java.util.Arrays;

/**
 *
 * @author caiqu
 */
public class Exercicio9 {

    public static void main(String[] args) {
        int vetorA[] = {1, 4, 5, 9, 7, 10};
        int vetorB[] = {2, 5, 6, 3, 4, 11};
        int vetorC[] = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print(Arrays.toString(vetorC));
    }
}
