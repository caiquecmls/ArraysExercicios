/*
Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
composto pelos elementos do vetor A e depois pelos elementos do vetor B. Imprimir o vetor C.
 */
package lista;

import java.util.Arrays;

/**
 *
 * @author caiqu
 */
public class Exercicio13 {

    public static void main(String[] args) {
        int vetorA[] = {1, 2, 5, 6, 4};
        int vetorB[] = {4, 3, 6, 5, 4};
        int vetorC[] = new int [vetorA.length + vetorB.length];
//
//        int vetorC[] = new int[vetorA.length + vetorB.length];
//        System.arraycopy(vetorA, 0, vetorC, 0, vetorA.length);
//        System.arraycopy(vetorB, 0, vetorC, vetorA.length, vetorB.length);
//
//        System.out.println(Arrays.toString(vetorC));
    
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
            vetorC[vetorA.length+i]=vetorB[i];
        }System.out.println(Arrays.toString(vetorC));
    
    }
}
