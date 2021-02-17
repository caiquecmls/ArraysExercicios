/*
 Dado um vetor de números inteiros e um número inteiro, fazer um programa que multiplique todos os
elementos do vetor pelo número real dado e imprima o resultado
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class exercicio7 {

    public static void main(String[] args) {
        int vetor[] = {7, 5, 9, 7, 2, 3, 4, 9, 1};

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(numero * vetor[i]);
        }
    }
}
