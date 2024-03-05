package org.example;
import java.util.Scanner;
public class FibonacciExample {
    public static void main(String[] args) {
        // Defina o número limite para gerar a sequência de Fibonacci
        int limiteSuperior = 10000;

        // Gere a sequência de Fibonacci até o limite superior
        int[] sequenciaFibonacci = generateFibonacci(limiteSuperior);

        // Solicite um número ao usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        // Verifique se o número está na sequência de Fibonacci
        if (checkIfInFibonacci(numeroInformado, sequenciaFibonacci)) {
            System.out.println(numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }

    public static int[] generateFibonacci(int limit) {
        int[] fibonacciSequence = new int[limit];
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for (int i = 2; i < limit; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }

        return fibonacciSequence;
    }

    public static boolean checkIfInFibonacci(int number, int[] fibonacciSequence) {
        for (int fibNumber : fibonacciSequence) {
            if (fibNumber == number) {
                return true;
            }
        }
        return false;
    }
}
