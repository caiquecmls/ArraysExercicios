/*
 Fazer um programa que lê uma sequência de N números inteiros positivos e reordena os elementos da
sequência de modo que todos os números pares venham primeiro e todos os ímpares em seguida. Por
exemplo, para a sequência [3, 6, 7, 8, 1, 2, 5, 3, 9], a saída deverá ser: [6, 8, 2, 3, 7, 1, 5, 3, 9].
 */
package lista;

import java.util.Arrays;

/**
 *
 * @author w10
 */
public class Exercicio16 {

    public static void main(String[] args) {
        int vetor[] = {3, 5, 7, 22, 9, 4, 2};

        int indicePar = 0;
        int indiceImpar = 0;
        int vetorAux[] = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetorAux[indicePar] = vetor[i];
                indicePar++;

            }

        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                vetorAux[indiceImpar + indicePar] = vetor[i];
                indiceImpar++;

            }

        }
        System.out.println(Arrays.toString(vetorAux));
    }
}
