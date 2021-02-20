/*
Dado um vetor de números reais e um número real, fazer um programa que multiplique todos os
elementos do vetor pelo número real dado e imprima o resultado.
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author w10
 */
public class Exercicio17 {
    public static void main (String[]args){
        double vetor[] = {2.5,6.3,6.2,5.7};
        Scanner sc = new Scanner (System.in);
        double multiplicador = sc.nextDouble();
        
        for (double d : vetor) {
            System.out.println(d*multiplicador);
        }
    }
}
