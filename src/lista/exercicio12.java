/*
Dados dois vetores A e B de mesma dimensão, fazer um programa que verifica a soma e a média de cada
vetor, e imprime a maior soma e a menor média.
 */
package lista;

/**
 *
 * @author caiqu
 */
public class Exercicio12 {

    public static void main(String[] args) {
        int vetorA[] = {1, 5, 3, 4, 8, 6, 7};
        int vetorB[] = {3, 4, 5, 6, 7, 5, 9};

        int somaVetorA = 0;
        int somaVetorB = 0;
        for (int i = 0; i < vetorA.length; i++) {
            somaVetorA = somaVetorA + vetorA[i];
            somaVetorB = somaVetorB + vetorB[i];

        }
        if (somaVetorA > somaVetorB) {
            System.out.println("Maior soma é " + somaVetorA + " vetorB");
        } else {
            System.out.println("Maior soma é " + somaVetorB + " vetorB");
        }

        if (somaVetorA / vetorA.length < somaVetorB / vetorB.length) {
            System.out.println("Maior média é " + somaVetorA / vetorA.length + " vetorA");
        } else {
            double aux = somaVetorB / vetorB.length;
            System.out.println("Maior média é " + String.format("%.f", aux) + " vetorA");
        }
    }
}
