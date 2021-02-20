/*
Fazer um programa que verifica se determinado número dado está dentro de um vetor também dado.
Caso esteja, imprimir a posição em que o número foi encontrado.
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author w10
 */
public class Exercicio18 {
    public static void main (String[]args){
        int vetor[] = {2,5,6,7,9,2,85,5};
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]==numero){
                System.out.println("O número se encontra no indice: "+i);
            }else{
                System.out.println("O número não está presente no vetor");
            }
        }        
    }
}
