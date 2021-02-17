/*
Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número
está presente no vetor
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class exercicio8 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int vetor[] = {1, 7, 8, 96, 4, 71, 46, 52};
        int numero = sc.nextInt();
        String resposta = "ausente";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                resposta = "presente";
            }
        }
        System.out.println("O número está " + resposta + " no vetor");
    }
}
