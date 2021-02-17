/*
Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor.
 */
package lista;

/**
 *
 * @author caiqu
 */
public class Exercicio4 {

    public static void main(String[] args) {
        double vetor[] = {2.4, 2.7, 8, 2.5, 100, 1.0};
        double menor = vetor[0];
        double maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
            if (menor > vetor[i]) { //verificar se menor "vetor[0] = 2.4" é maior que vetor[i] se for maior 
                menor = vetor[i];   // variavel menor recebe o elemento do indice que foi menor que ela 
            }
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}
