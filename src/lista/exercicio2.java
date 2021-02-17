/*
Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o
resultado.
 */
package lista;

/**
 *
 * @author caiqu
 */
public class Exercicio2 {

    public static void main(String[] args) {
        double vetor[] = {3.5, 4.7, 2.3};
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma=soma+vetor[i];
        }
        System.out.println(soma);
    }
}
