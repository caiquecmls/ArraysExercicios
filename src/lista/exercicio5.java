/*
Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor
 */
package lista;

/**
 *
 * @author caiqu
 */
public class exercicio5 {

    public static void main(String[] args) {
        int vetor[] = {5, 7, 5, 7, 5, 7};
        int tam = vetor.length;
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        System.out.println(soma / tam);
    }
}
