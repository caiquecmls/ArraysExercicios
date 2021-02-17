/*
    Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor.
 */
package lista;

/**
 *
 * @author caiqu
 */
public class Exercicio3 {

    public static void main(String[] args) {
        int vetor[]= {1,2,6,7,13,3};
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(maior < vetor[i]){
               maior=vetor[i];
            }
        }System.out.println(maior);
    }
}
