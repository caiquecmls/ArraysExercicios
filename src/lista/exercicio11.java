/*
Dado um vetor de números reais, fazer um programa que imprima os números maiores do que a média
dos elementos que estão nas posições pares do vetor.
 */
package lista;

/**
 *
 * @author caiqu
 */
public class Exercicio11 {

    public static void main(String[] args) {
        double vetor[] = {1.0, 3.5, 6.0, 1.2, 4.0};
        double media = 0;
        for (double d : vetor) {
            if (d % 2 == 0) {
                media = media + d / vetor.length;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i]);
            }
        }
//        System.out.println(media);
    }
}
