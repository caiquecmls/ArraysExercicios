/*
Dado um vetor de números reais e um número real, fazer um programa que multiplique os elementos de
posição ímpar do vetor pelo número real dado e imprima o resultado.
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author caiqu
 */
public class exercicio10 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double vetor[] = {2.0, 3.5, 4.5, 5.7};
        double numero = sc.nextDouble();

        for (double d : vetor) {
            double resultado = 0;
            if (d % 2 != 0) {
                resultado = d * numero;
            } else {
                resultado = d;
            }
            System.out.println(resultado);
        }
    }
}
