/*
 Dado um vetor de números inteiros, fazer um programa que imprima o vetor em ordem crescente.

 */
package lista;

import java.util.Arrays;

/**
 *
 * @author w10
 */
public class Exercicio15 {

    public static void main(String[] args) {
        int vetor[] = {2, 1, 4, 6, 8, 5};
        int aux;
        int p = 1;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
            System.out.println(Arrays.toString(vetor));
//            if (vetor[i] > vetor[p]) {
//                aux = vetor[p];
//                vetor[p] = vetor[i];
//                vetor[i] = aux;
//                p++;
//            } else {
//                p++;
//            }
        }
//        System.out.print("Ordem crescente:    ");
//        for (int j = 0; j < vetor.length; j++) {
//            System.out.print(vetor[j] + "  ");
//        }
    }
}
