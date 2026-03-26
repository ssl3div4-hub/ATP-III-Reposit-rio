package br.com.fatec.tpi03;

import java.util.Scanner;

public class Exercicio2Fibonacci {
    public static void executar(Scanner scanner) {
        System.out.println("\n--- Exercício 2: Sequência de Fibonacci até o n-ésimo termo ---");
        int n = InputUtils.lerInteiro(scanner, "Digite a quantidade de termos (n > 0): ");

        if (n <= 0) {
            System.out.println("Erro: n deve ser maior que zero.");
            return;
        }

        StringBuilder serie = new StringBuilder("Série: ");
        long a = 1;
        long b = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                serie.append(1);
            } else {
                long proximo = a + b;
                serie.append(proximo);
                a = b;
                b = proximo;
            }

            if (i < n) {
                serie.append(", ");
            }
        }

        System.out.println(serie);
    }
}
