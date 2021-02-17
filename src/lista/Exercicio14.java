/*
Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
composto, alternadamente, por um elemento do vetor A e outro do vetor B. Imprimir o vetor C.

 */
package lista;

import java.util.Arrays;

/**
 *
 * @author w10
 */
public class Exercicio14 {

    public static void main(String[] args) {
        int vetorA[] = {6, 4, 3, 2, 5};
        int vetorB[] = {1, 3, 7, 4, 5};
        int vetorC[] = new int[vetorA.length + vetorB.length];

        int p = 0;
        int c = 1;
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[p] = vetorA[i];
            p = p + 2;
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[c] = vetorB[i];
            c = c + 2;
        }
        System.out.println(Arrays.toString(vetorC));
    }
}
