/*
Fazer um programa que imprime os elementos que estão nas posições ímpares de um vetor (começando
na posição 1, que corresponde à posição 0 em Java). Por exemplo, para o vetor [6, 8, 2, 3, 7, 1, 5, 3, 9],
seriam impressos os números: 6, 2, 7, 5, 9.
 */
package lista;

/**
 *
 * @author w10
 */
public class Exercicio19 {

    public static void main(String[] args) {
        int vetor[] = {6, 8, 2, 3, 7, 1, 5, 3, 9};

        System.out.println("Elementos das posições pares");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {

                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Elementos das posições impares");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 != 0) {

                System.out.print(vetor[i] + " ");
            }
        }
    }
}
